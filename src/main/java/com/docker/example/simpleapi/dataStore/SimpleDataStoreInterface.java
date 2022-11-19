package com.docker.example.simpleapi.dataStore;

import java.util.Collection;
import java.util.List;

import org.json.simple.JSONObject;

public interface SimpleDataStoreInterface {
    public void addData(JSONObject data);
    public Collection<JSONObject> fetchAllData();
    public JSONObject fetchSpecificData(String usn);
    public void updateSpecificData(JSONObject data);
    public void deleteAllData();
    public void deleteSpecificData(String usn);
}
