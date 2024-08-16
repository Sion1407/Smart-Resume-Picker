package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "students")
public class CandidateApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "application_id")
    private int applicationId;

    @Column(name = "job_id")
    private int jobId;

    @Column(name = "fullname")
    private String fullName;

    @Column(name = "currentlocation")
    private String currentLocation;

    @Lob
    @Column(name = "resume_content")
    private byte[] resumeContent;

    @Column(name = "applicationdate")
    private LocalDate applicationDate;

    @Column(name = "skills")
    private String skills;
}