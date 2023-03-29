package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.entity.Symptom;
import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.service.TestService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;


    @GetMapping(value = "/{id}", produces = "application/json")
    public void testSave(@PathVariable String id) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Organ organ = Organ.builder().name("respiratory organ").build();

        testService.saveSystem(organ);

        long systemId = organ.getId();

        log.info("Created: " + objectMapper.writeValueAsString(organ));

        Symptom symptom =  Symptom.builder().name("Cough").build();

        testService.saveSymptom(symptom);

//        testService.addSymptomToSystem(systemId, symptom);


        log.info("Created: " + objectMapper.writeValueAsString(symptom));

        log.info("Symptom was retrieved : " + testService.findSymptomById(symptom.getId()).getName());

//        log.info("Organ was retrieved :" + objectMapper.writeValueAsString(testService.findSystemById(systemId)));

        log.info("Organ with Symptoms : " + objectMapper.writeValueAsString(testService.findSymptomById(symptom.getId())));


    }

}
