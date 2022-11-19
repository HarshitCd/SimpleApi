package com.docker.example.simpleapi.dataStore.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;

public class SimpleDataStoreUsingMaps implements SimpleDataStoreInterface {

    Map<String, JSONObject> dataStore = new HashMap<>();

    @Override
    public void addData(JSONObject data) {
        
        final String usn = data.get("usn").toString();

        if(dataStore.get(usn) == null) {
            dataStore.put(usn, data);
        }
    }

    @Override
    public Collection<JSONObject> fetchAllData() {
        
        return dataStore.values();
    }

    @Override
    public JSONObject fetchSpecificData(String usn) {
        
        for(String key: dataStore.keySet()) System.out.println(usn.equals(key));
        return dataStore.getOrDefault(usn, new JSONObject());
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
    public void updateSpecificData(JSONObject data) {
        
        final String usn = data.get("usn").toString();
        
        if(dataStore.get(usn) != null) {
            dataStore.put(usn, data);
        }
        
    }
    
}
