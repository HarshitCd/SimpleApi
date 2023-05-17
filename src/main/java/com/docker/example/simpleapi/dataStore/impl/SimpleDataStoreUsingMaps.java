package com.docker.example.simpleapi.dataStore.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.models.TodoModel;

public class SimpleDataStoreUsingMaps implements SimpleDataStoreInterface {

    Map<UUID, TodoModel> dataStore = new HashMap<>();

    @Override
    public void addData(TodoModel data) {
        
        final UUID id = data.getId();

        if(dataStore.get(id) == null) {
            dataStore.put(id, data);
        }
    }

    @Override
    public Collection<TodoModel> fetchAllData() {
        
        return dataStore.values();
    }

    @Override
    public TodoModel fetchSpecificData(UUID id) {
        
        return dataStore.getOrDefault(id, new TodoModel());
    }

    @Override
    public void deleteAllData() {

        dataStore.clear();
    }

    @Override
    public void deleteSpecificData(UUID id) {
        
        dataStore.remove(id);
    }

    @Override
    public void updateSpecificData(TodoModel data) {
        
        final UUID id = data.getId();
        
        if(dataStore.get(id) != null) {
            dataStore.put(id, data);
        }
        
    }
    
}
