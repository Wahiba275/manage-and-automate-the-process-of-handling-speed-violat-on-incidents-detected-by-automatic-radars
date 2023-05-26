package com.example.registration_service.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OwnerRequest {

    private String name;
    private Date birthDate;
    private String email;

}