package com.example.myhealthappbe.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "symptom_table")
@Getter
@Setter
@NoArgsConstructor
public class Symptom {
    @Builder
    public Symptom(String name, Organ organ) {
        this.name = name;
        this.organ = organ;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @JsonProperty
    private String name;

    @ManyToOne
    @JoinColumn(name = "organ_id")
    @JsonBackReference
    private Organ organ;

}
