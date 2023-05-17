package com.docker.example.simpleapi.controllers;

import java.util.Collection;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.example.simpleapi.models.TodoModel;
import com.docker.example.simpleapi.services.SimpleServiceInterface;

@RestController()
public class SimpleRestController {
    
    @Autowired
    private SimpleServiceInterface service;

    @GetMapping(value={"/", "/home"})
    public String homeEndPoint() {
        return "Hello There!";
    }

    @PostMapping("/addData")
    public void addData(@RequestBody TodoModel data) {
        service.addData(data);
    }

    @GetMapping("/fetchAllData")
    public Collection<TodoModel> fetchAddData() {
        return service.fetchAllData();
    }

    @GetMapping("/fetchSpecificData/{id}")
    public TodoModel fetchSpecificData(@PathVariable UUID id) {
        return service.fetchSpecificData(id);
    }

    @PutMapping("/updateSpecificData")
    public void updateSpecificData(@RequestBody TodoModel data) {
        service.updateSpecificData(data);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        service.deleteAllData();
    }

    @DeleteMapping("/deleteSpecificData/{id}")
    public void deleteSpecificData(@PathVariable UUID id) {
        service.deleteSpecificData(id);
    }
}
