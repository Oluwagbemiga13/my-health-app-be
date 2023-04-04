package com.example.myhealthappbe.mapper;

import com.example.myhealthappbe.dto.OrganDto;
import com.example.myhealthappbe.entity.Organ;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OrganMapper extends GenericMapper<Organ, OrganDto>{
}
