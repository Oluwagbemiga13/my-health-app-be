package com.example.myhealthappbe.dto.related;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SymptomWithOrganDto {
        @JsonProperty
        private long id;
        @JsonProperty
        private  String name;
        @JsonProperty
        private OrganWithSymptomsDto organ;

        @JsonCreator
        public SymptomWithOrganDto(
                @JsonProperty("id") Long id,
                @JsonProperty("name") String name,
                @JsonProperty("organ") OrganWithSymptomsDto organ
        ) {
                this.id = id == null ? 0L : id;
                this.name = name;
                this.organ = organ;
        }
}
