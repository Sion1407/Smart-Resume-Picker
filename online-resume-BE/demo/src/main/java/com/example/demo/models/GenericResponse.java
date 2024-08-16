package com.example.demo.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GenericResponse {
    public boolean isValidHrUser;

    public boolean getIsValidHrUser() {
        return isValidHrUser;
    }

    public void setIsValidHrUser(boolean isValidHrUser) {
        this.isValidHrUser = isValidHrUser;
    }
}
