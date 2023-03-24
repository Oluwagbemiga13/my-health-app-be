package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.service.TestService;
import com.example.myhealthappbe.sympthoms.Symptom;
import com.example.myhealthappbe.sympthoms.System;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;


    @GetMapping(value = "/{id}", produces = "application/json")
    public void testSave(@PathVariable Long id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        System system = new System("respiratory system");

        testService.saveSystem(system);

        long systemId = system.getId();

        log.info("Created: " + objectMapper.writeValueAsString(system));

        Symptom symptom = new Symptom("Cough");

        testService.saveSymptom(symptom);

        testService.addSymptomToSystem(systemId, symptom);

        testService.addSystemToSymptom(symptom.getId(), system);

        log.info("Created: " + objectMapper.writeValueAsString(symptom));

        log.info("Symptom was retrieved : " + testService.findSymptomById(symptom.getId()).getName());

        log.info("System was retrieved :" + objectMapper.writeValueAsString(testService.findSystemById(systemId)));

        log.info("System with Symptoms : " + objectMapper.writeValueAsString(testService.findSymptomById(symptom.getId())));

    }

}
