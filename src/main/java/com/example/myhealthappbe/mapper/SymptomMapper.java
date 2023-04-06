package com.example.myhealthappbe.mapper;

import com.example.myhealthappbe.dto.related.SymptomWithOrganDto;
import com.example.myhealthappbe.entity.Symptom;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SymptomMapper extends GenericMapper<Symptom, SymptomWithOrganDto>{
}
