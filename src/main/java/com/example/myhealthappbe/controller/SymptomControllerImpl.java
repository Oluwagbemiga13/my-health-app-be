package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.service.SymptomService;
import com.example.myhealthappbe.entity.Symptom;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
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

    @Override
    public ResponseEntity<Symptom> testSave(String json) {
        Symptom symptom = new Symptom();
        try{
            symptom = objectMapper.readValue(json, Symptom.class);

            // Process the symptom object
        } catch (Exception e) {
            log.error("Error processing symptom JSON data: {}", e.getMessage());
            // Handle the exception
        }
        log.info("Symptom '{}' was read successfully.", symptom.getName());
        symptomService.saveSymptom(symptom);


        return ResponseEntity.ok().build();
    }
    }

