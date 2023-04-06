package com.example.myhealthappbe.mapper;

import com.example.myhealthappbe.dto.independent.SymptomDto;
import com.example.myhealthappbe.entity.indipendent.SymptomInd;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface SymptomMapper extends GenericMapper<SymptomInd, SymptomDto> {
}
