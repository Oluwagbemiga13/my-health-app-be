package com.example.myhealthappbe.sympthoms;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item_table")
@NoArgsConstructor
public class Symptom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Set<System> getSystems() {
        return systems;
    }

    public Symptom(String name) {
        this.name = name;
    }


    @JsonBackReference
    @ManyToMany(mappedBy = "symptoms")
    private Set<System> systems = new HashSet<>();


}
