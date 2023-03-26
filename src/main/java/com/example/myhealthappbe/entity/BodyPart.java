package com.example.myhealthappbe.entity;

import java.util.List;

public class BodyPart {
    private String name;
    private List<Organ> organs;

    public BodyPart(String name, List<Organ> organs) {
        this.name = name;
        this.organs = organs;
    }

    public String getName() {
        return name;
    }

    public List<Organ> getSystems() {
        return organs;
    }
}
