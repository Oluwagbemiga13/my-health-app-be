package com.example.myhealthappbe.dto.independent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SymptomDto {

    private Long id;
    private String name;
    private OrganDto organDto;

    @JsonCreator
    public SymptomDto(@JsonProperty("id") Long id,
                      @JsonProperty("name") String name,
                      @JsonProperty("organDto") OrganDto organDto) {
        this.id = id;
        this.name = name;
        this.organDto = organDto;
    }
}

