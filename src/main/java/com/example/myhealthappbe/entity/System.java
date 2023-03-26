package com.example.myhealthappbe.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "system_table")
@NoArgsConstructor
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;

    public List<Symptom> getSymptoms() {
        return symptoms;
    }

    @OneToMany(mappedBy = "system")
    private List<Symptom> symptoms = new ArrayList<>();

    public System(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
