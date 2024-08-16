package com.example.demo.dao;

import com.example.demo.entity.HrUsersEntity;
import com.example.demo.models.HrDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GetHrDetails extends JpaRepository<HrUsersEntity,Integer> {
    Optional<HrUsersEntity> findByUsername(String username);
}
