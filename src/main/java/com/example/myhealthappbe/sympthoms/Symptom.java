package com.example.myhealthappbe.sympthoms;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "item_table")
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

    public System getSystem() {
        return system;
    }

    public Symptom(String name, System system) {
        this.name = name;
        this.system = system;
    }

    @ManyToOne
    @JoinColumn(name = "system_id")
    @JsonBackReference
    private System system;


}
