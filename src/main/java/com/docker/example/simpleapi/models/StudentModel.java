package com.docker.example.simpleapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {
    private String usn;
    private String name;
    private double age;
    private String department;
}
