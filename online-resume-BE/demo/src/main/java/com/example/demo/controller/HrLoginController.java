package com.example.demo.controller;

import com.example.demo.exceptions.InvalidUserException;
import com.example.demo.exceptions.NoUserNameFoundException;
import com.example.demo.models.GenericResponse;
import com.example.demo.models.HrDetails;
import com.example.demo.service.HrLoginFlow;
import com.example.demo.utils.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/onlineresume/service")
public class HrLoginController {
    private static final Logger log = LoggerFactory.getLogger(HrLoginController.class);

    @Autowired
    HrLoginFlow hrLoginFlow;

    @GetMapping(value = "/validateHrLogin")
    public ResponseEntity<GenericResponse> validateHrUser(@RequestParam String username,
                                                          @RequestParam String password){
        GenericResponse genericResponse = hrLoginFlow.validateHrUser(username,password);
        if (null!=genericResponse){
           return new ResponseEntity<>(genericResponse,HttpStatus.OK);
        }
        throw new InvalidUserException(Constants.ONE_0001,"Invalid username and password");
    }

    @GetMapping(value = "/getAllHrDetails")
    public ResponseEntity<HrDetails> getAllHrDetails(@RequestParam String username){
        HrDetails hrDetails = hrLoginFlow.getHrDetails(username);
        if (null!=hrDetails){
            return new ResponseEntity<>(hrDetails,HttpStatus.OK);
        }
        throw new NoUserNameFoundException(Constants.ONE_0002,"No user found with the given username");
    }
}
