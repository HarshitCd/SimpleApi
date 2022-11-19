package com.docker.example.simpleapi.controllers;

import java.util.Collection;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    public void addData(@RequestBody JSONObject data) {
        service.addData(data);
    }

    @GetMapping("/fetchAllData")
    public Collection<JSONObject> fetchAddData() {
        return service.fetchAllData();
    }

    @GetMapping("/fetchSpecificData/{usn}")
    public JSONObject fetchSpecificData(@PathVariable String usn) {
        return service.fetchSpecificData(usn);
    }

    @PutMapping("/updateSpecificData")
    public void updateSpecificData(@RequestBody JSONObject data) {
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
