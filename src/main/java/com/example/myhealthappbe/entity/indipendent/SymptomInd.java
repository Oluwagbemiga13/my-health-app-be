package com.example.myhealthappbe.entity.indipendent;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "symptom_ind_table")
@Getter
@Setter
@NoArgsConstructor
public class SymptomInd {
    @Builder
    public SymptomInd(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

