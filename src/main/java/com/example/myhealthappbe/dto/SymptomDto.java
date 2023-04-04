package com.example.myhealthappbe.dto;

import com.example.myhealthappbe.entity.Organ;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

public record SymptomDto(
        @JsonProperty
        long id,
        @JsonProperty
        String name,
//        @JsonProperty
        @JsonBackReference
        Organ organ
) {
}
