package com.example.demo.service;

import com.example.demo.models.GenericResponse;
import com.example.demo.models.HrDetails;

public interface HrLoginFlow {
    GenericResponse validateHrUser(String username, String password);
    HrDetails getHrDetails(String username);

}
