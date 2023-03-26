package com.example.myhealthappbe.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "system_table")
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


    public Symptom(String name) {
        this.name = name;
    }

    @ManyToOne
    @JoinColumn(name = "system_id")
    private System system;


}
