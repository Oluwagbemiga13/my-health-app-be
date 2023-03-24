package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.service.TestService;
import com.example.myhealthappbe.sympthoms.Symptom;
import com.example.myhealthappbe.sympthoms.System;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
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
    public void testSave(@PathVariable Long id) throws JsonProcessingException, InterruptedException {
        ObjectMapper objectMapper = new ObjectMapper();
        System system = new System("respiratory system");

        testService.saveSystem(system);

        log.info("Created: " + objectMapper.writeValueAsString(system));

        Symptom symptom = new Symptom("Cough",system);

        testService.saveSymptom(symptom);

        log.info("Created: " + objectMapper.writeValueAsString(symptom));

        log.info("Symptom was retrieved. name : " + testService.findById(symptom.getId()).getName());

    }

}
