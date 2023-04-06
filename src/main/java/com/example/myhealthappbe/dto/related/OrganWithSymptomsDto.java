package com.example.myhealthappbe.dto.related;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrganWithSymptomsDto {
        @JsonProperty
        private long id;
        @JsonProperty
        private String name;
        @JsonProperty
        private List<SymptomWithOrganDto> symptoms;

        @JsonCreator
        public OrganWithSymptomsDto(
                @JsonProperty("id") Long id,
                @JsonProperty("name") String name,
                @JsonProperty("symptoms") List<SymptomWithOrganDto> symptoms
        ) {
                this.id = id == null ? 0L : id;
                this.name = name;
                this.symptoms = symptoms;
        }
}
