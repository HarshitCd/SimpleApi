package com.docker.example.simpleapi.dataStore;

import java.util.Collection;

import com.docker.example.simpleapi.models.StudentModel;

public interface SimpleDataStoreInterface {
    public void addData(StudentModel data);
    public Collection<StudentModel> fetchAllData();
    public StudentModel fetchSpecificData(String usn);
    public void updateSpecificData(StudentModel data);
    public void deleteAllData();
    public void deleteSpecificData(String usn);
}
