package com.example.myhealthappbe.sympthoms;

import java.util.List;

public class BodyPart {
    private String name;
    private List<System> systems;

    public BodyPart(String name, List<System> systems) {
        this.name = name;
        this.systems = systems;
    }

    public String getName() {
        return name;
    }

    public List<System> getSystems() {
        return systems;
    }
}
