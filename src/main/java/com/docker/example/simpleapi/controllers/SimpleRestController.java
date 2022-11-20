package com.docker.example.simpleapi.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docker.example.simpleapi.models.StudentModel;
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
    public void addData(@RequestBody StudentModel data) {
        service.addData(data);
    }

    @GetMapping("/fetchAllData")
    public Collection<StudentModel> fetchAddData() {
        return service.fetchAllData();
    }

    @GetMapping("/fetchSpecificData/{usn}")
    public StudentModel fetchSpecificData(@PathVariable String usn) {
        return service.fetchSpecificData(usn);
    }

    @PutMapping("/updateSpecificData")
    public void updateSpecificData(@RequestBody StudentModel data) {
        service.updateSpecificData(data);
    }

    @DeleteMapping("/deleteAll")
    public void deleteAll() {
        service.deleteAllData();
    }

    @DeleteMapping("/deleteSpecificData/{usn}")
    public void deleteSpecificData(@PathVariable String usn) {
        service.deleteSpecificData(usn);
    }
}
