package com.docker.example.simpleapi.dataStore;

import java.util.Collection;
import java.util.UUID;

import com.docker.example.simpleapi.models.TodoModel;

public interface SimpleDataStoreInterface {
    public void addData(TodoModel data);
    public Collection<TodoModel> fetchAllData();
    public TodoModel fetchSpecificData(UUID id);
    public void updateSpecificData(TodoModel data);
    public void deleteAllData();
    public void deleteSpecificData(UUID id);
}
