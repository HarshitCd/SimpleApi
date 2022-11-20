package com.docker.example.simpleapi.dataStore.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.models.StudentModel;

public class SimpleDataStoreUsingMaps implements SimpleDataStoreInterface {

    Map<String, StudentModel> dataStore = new HashMap<>();

    @Override
    public void addData(StudentModel data) {
        
        final String usn = data.getUsn();

        if(dataStore.get(usn) == null) {
            dataStore.put(usn, data);
        }
    }

    @Override
    public Collection<StudentModel> fetchAllData() {
        
        return dataStore.values();
    }

    @Override
    public StudentModel fetchSpecificData(String usn) {
        
        return dataStore.getOrDefault(usn, new StudentModel());
    }

    @Override
    public void deleteAllData() {

        dataStore.clear();
    }

    @Override
    public void deleteSpecificData(String usn) {
        
        dataStore.remove(usn);
    }

    @Override
    public void updateSpecificData(StudentModel data) {
        
        final String usn = data.getUsn();
        
        if(dataStore.get(usn) != null) {
            dataStore.put(usn, data);
        }
        
    }
    
}
