package com.example.myhealthappbe.entity;


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

    public long getId() {
        return id;
    }

    private String name;

    @ManyToOne
    @JoinColumn(name = "organ_id")
    private Organ organ;


}
