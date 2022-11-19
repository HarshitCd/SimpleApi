package com.docker.example.simpleapi.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.docker.example.simpleapi.dataStore.SimpleDataStoreInterface;
import com.docker.example.simpleapi.dataStore.impl.SimpleDataStoreUsingMaps;
import com.docker.example.simpleapi.services.SimpleServiceInterface;
import com.docker.example.simpleapi.services.impl.MySimpleService;

@Configuration
public class SimpleApiConfig {
    
    @Bean
    public SimpleServiceInterface simpleServiceInterface() {
        return new MySimpleService();
    }

    @Bean
    public SimpleDataStoreInterface simpleDataStoreInterface() {
        return new SimpleDataStoreUsingMaps();
    }
}
