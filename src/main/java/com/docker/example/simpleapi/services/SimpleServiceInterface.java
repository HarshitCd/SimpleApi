package com.docker.example.simpleapi.services;

import java.util.Collection;

import com.docker.example.simpleapi.models.TodoModel;

import java.util.UUID;

public interface SimpleServiceInterface {
    public void addData(TodoModel data);
    public Collection<TodoModel> fetchAllData();
    public TodoModel fetchSpecificData(UUID id);
    public void updateSpecificData(TodoModel data);
    public void deleteAllData();
    public void deleteSpecificData(UUID id);
}
