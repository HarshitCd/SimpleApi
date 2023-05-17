package com.docker.example.simpleapi.services.impl;

import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.models.TodoModel;
import com.docker.example.simpleapi.services.SimpleServiceInterface;

public class MySimpleService implements SimpleServiceInterface {

    @Autowired
    private SimpleDataStoreInterface dataStore;

    @Override
    public void addData(TodoModel data) {
        dataStore.addData(data);
    }

    @Override
    public Collection<TodoModel> fetchAllData() {
        return dataStore.fetchAllData();
    }

    @Override
    public TodoModel fetchSpecificData(UUID id) {
        return dataStore.fetchSpecificData(id);
    }

    @Override
    public void updateSpecificData(TodoModel data) {
        dataStore.updateSpecificData(data);
    }

    @Override
    public void deleteAllData() {
        dataStore.deleteAllData();
    }

    @Override
    public void deleteSpecificData(UUID id) {
        dataStore.deleteSpecificData(id);
    }
    
}
