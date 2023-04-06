package com.example.myhealthappbe.dto.independent;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrganDto {

    private Long id;
    private String name;

    @JsonCreator
    public OrganDto(@JsonProperty("id") Long id,
                    @JsonProperty("name") String name) {
        this.id = id;
        this.name = name;
    }
}

