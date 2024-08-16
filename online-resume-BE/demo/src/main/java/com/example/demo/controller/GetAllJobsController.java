package com.example.demo.controller;

import com.example.demo.entity.JobEntity;
import com.example.demo.service.JobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.impl.JobServiceImpl;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/onlineresume/service")
public class GetAllJobsController {
    @Autowired
    JobService jobService;
    private static final Logger log = LoggerFactory.getLogger(GetAllJobsController.class);
    @GetMapping(value = "/getJobsDetails")
    public ResponseEntity<List<JobEntity>> getAllJobList(){
        List<JobEntity> jobEntities = jobService.getAllJobs();
        if (!jobEntities.isEmpty()){
            log.debug("jobEntity response: "+ jobEntities);
            return new ResponseEntity<>(jobEntities, HttpStatus.OK);
        }
        else {
            log.error("no data found in jobs db");
            return new ResponseEntity<>(jobEntities, HttpStatus.OK);
        }
    }
}
