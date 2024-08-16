package com.example.demo.service.impl;

import com.example.demo.dao.GetAllJobsDetails;
import com.example.demo.entity.JobEntity;
import com.example.demo.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {
    @Autowired
    GetAllJobsDetails getAllJobsDetails;

    public List<JobEntity> getAllJobs() {
        return getAllJobsDetails.findAll();
    }

}
