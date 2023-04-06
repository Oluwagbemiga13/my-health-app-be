package com.example.myhealthappbe.entity.indipendent;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "symptom_ind_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
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

