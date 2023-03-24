package com.example.myhealthappbe.sympthoms;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "system_table")
public class System {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    public String getName() {
        return name;
    }

    public System(String name) {
        this.name = name;
    }

    @OneToMany(mappedBy = "system")
    @JsonManagedReference
    private List<Symptom> symptomList;


}
