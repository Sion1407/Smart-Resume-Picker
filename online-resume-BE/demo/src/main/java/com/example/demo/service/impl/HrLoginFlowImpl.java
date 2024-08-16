package com.example.demo.service.impl;

import com.example.demo.dao.GetHrDetails;
import com.example.demo.entity.HrUsersEntity;
import com.example.demo.exceptions.InvalidUserException;
import com.example.demo.exceptions.NoUserNameFoundException;
import com.example.demo.models.GenericResponse;
import com.example.demo.models.HrDetails;
import com.example.demo.service.HrLoginFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Service
public class HrLoginFlowImpl implements HrLoginFlow {
    private final PasswordEncoder passwordEncoder;
    @Autowired
    GetHrDetails getHrDetails;


    public HrLoginFlowImpl(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public GenericResponse validateHrUser(String username,String password){
        List<HrUsersEntity> hrUsersEntities = getHrDetails.findAll();
        List<HrUsersEntity> userDetail = hrUsersEntities.stream()
                    .filter(user -> user.getUsername().equalsIgnoreCase(username))
                    .toList();
        if (!userDetail.isEmpty()){
            String hashedPassword = userDetail.get(0).getHashedpassword();
            if (hashedPassword.matches(password))
                return new GenericResponse(true);
            throw new InvalidUserException("Invalid password for the given user try again");
        }
        return new GenericResponse(false);
    }
    public HrDetails getHrDetails(String username){
        Optional<HrUsersEntity> hrUsersEntities = getHrDetails.findByUsername(username);
        HrDetails hrDetails = new HrDetails();
        hrUsersEntities.ifPresentOrElse(hrUsersEntity -> {
            hrDetails.setFullName(hrUsersEntity.getFullname());
        },()->{
            throw new NoUserNameFoundException("No user found with the given username");
        });
        return hrDetails;
    }
}
