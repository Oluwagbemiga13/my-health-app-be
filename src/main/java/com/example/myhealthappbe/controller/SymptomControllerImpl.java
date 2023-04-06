package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.independent.SymptomDto;
import com.example.myhealthappbe.mapper.SymptomMapper;
import com.example.myhealthappbe.service.OrganService;
import com.example.myhealthappbe.service.SymptomService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@Slf4j
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SymptomControllerImpl implements SymptomController{

    private final SymptomService symptomService;
    private final ObjectMapper objectMapper;

    private final OrganService organService;

    private final SymptomMapper symptomMapper;

    @Override
    public ResponseEntity<SymptomDto> testSave(SymptomDto symptomDto) {

        log.info("Accepted: " + symptomDto.toString());

        symptomService.saveSymptom(symptomMapper.toEntity(symptomDto));

        return ResponseEntity.ok(symptomDto);
    }
    }

