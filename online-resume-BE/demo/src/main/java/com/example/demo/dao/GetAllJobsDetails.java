package com.example.demo.dao;

import com.example.demo.entity.JobEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GetAllJobsDetails extends JpaRepository<JobEntity, Long> {

//    @Query(value = "SELECT * FROM jobs", nativeQuery = true)
//    List<JobEntity> findAllJobs();
}
