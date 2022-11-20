package com.docker.example.simpleapi.services;

import java.util.Collection;

import com.docker.example.simpleapi.models.StudentModel;

public interface SimpleServiceInterface {
    public void addData(StudentModel data);
    public Collection<StudentModel> fetchAllData();
    public StudentModel fetchSpecificData(String usn);
    public void updateSpecificData(StudentModel data);
    public void deleteAllData();
    public void deleteSpecificData(String usn);
}
