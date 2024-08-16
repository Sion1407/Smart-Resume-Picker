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
@Table(name = "jobs")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobId")
    private Long jobid; // match the column name
    @Column(name = "role")
    private String role;
    @Column(name = "location")
    private String location;
    @Column(name = "description")
    private String description;

    @Column(name = "postedDate") // match the exact column name if different from field name
    private LocalDate postedDate;

}
