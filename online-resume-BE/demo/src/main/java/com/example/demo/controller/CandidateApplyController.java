package com.example.demo.controller;

import com.example.demo.entity.CandidateApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@CrossOrigin
@RestController
@RequestMapping("/onlineresume/service")
public class CandidateApplyController {


//    @PostMapping(value = "/candidateApply")
//    public ResponseEntity<CandidateApplication> submitApplication(
//            @RequestParam("jobId") int jobId,
//            @RequestParam("fullName") String fullName,
//            @RequestParam("currentLocation") String currentLocation,
//            @RequestParam("resume") MultipartFile resume,
//            @RequestParam("skills") String skills) {
//
//        try {
//            byte[] resumeContent = resume.getBytes();
//            CandidateApplication application = service.submitApplication(jobId, fullName, currentLocation, resumeContent, skills);
//            return new ResponseEntity<>(application, HttpStatus.CREATED);
//        } catch (IOException e) {
//            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
