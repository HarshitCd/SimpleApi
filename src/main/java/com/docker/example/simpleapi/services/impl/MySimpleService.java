package com.docker.example.simpleapi.services.impl;

import java.util.Collection;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.services.SimpleServiceInterface;

public class MySimpleService implements SimpleServiceInterface {

    @Autowired
    private SimpleDataStoreInterface dataStore;

    @Override
    public void addData(JSONObject data) {
        dataStore.addData(data);
    }

    @Override
    public Collection<JSONObject> fetchAllData() {
        return dataStore.fetchAllData();
    }

    @Override
    public JSONObject fetchSpecificData(String usn) {
        return dataStore.fetchSpecificData(usn);
    }

    @Override
    public void updateSpecificData(JSONObject data) {
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
