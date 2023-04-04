package com.example.myhealthappbe.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty()
    private long id;

    public Organ(String name){
        this.name = name;
        symptoms = new ArrayList<>();
    }
    @JsonProperty()
    private String name;

    @OneToMany(mappedBy = "organ")
    @JsonManagedReference
    private List<Symptom> symptoms = new ArrayList<>();


}
