package com.docker.example.simpleapi.services.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.models.StudentModel;
import com.docker.example.simpleapi.services.SimpleServiceInterface;

public class MySimpleService implements SimpleServiceInterface {

    @Autowired
    private SimpleDataStoreInterface dataStore;

    @Override
    public void addData(StudentModel data) {
        dataStore.addData(data);
    }

    @Override
    public Collection<StudentModel> fetchAllData() {
        return dataStore.fetchAllData();
    }

    @Override
    public StudentModel fetchSpecificData(String usn) {
        return dataStore.fetchSpecificData(usn);
    }

    @Override
    public void updateSpecificData(StudentModel data) {
        dataStore.updateSpecificData(data);
    }

    @Override
    public void deleteAllData() {
        dataStore.deleteAllData();
    }

    @Override
    public void deleteSpecificData(String usn) {
        dataStore.deleteSpecificData(usn);
    }
    
}
