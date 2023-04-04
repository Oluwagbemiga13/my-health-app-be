package com.example.myhealthappbe.dto;

import com.example.myhealthappbe.entity.Symptom;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record OrganDto(
        @JsonProperty(defaultValue = "0")
        Long id,
        @JsonProperty
        String name,
//        @JsonProperty
        @JsonManagedReference
        List<Symptom> symptoms
) {
}
