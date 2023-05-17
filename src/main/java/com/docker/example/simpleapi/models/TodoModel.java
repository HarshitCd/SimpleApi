package com.docker.example.simpleapi.models;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TodoModel {
    private final UUID id;
    private String title;
    private String description;

    public TodoModel() {
        id = UUID.randomUUID();
    }
}
