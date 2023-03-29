package com.example.myhealthappbe.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "organ_table")
@Getter
@Setter
@NoArgsConstructor
public class Organ {

    @Builder
    public Organ(String name, List<Symptom> symptoms) {
        this.name = name;
        this.symptoms = symptoms;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String name;

    public List<Symptom> getOrgans() {
        return symptoms;
    }

    @OneToMany(mappedBy = "organ")
    private List<Symptom> symptoms = new ArrayList<>();


}
