package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.SymptomDto;
import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.service.OrganService;
import com.example.myhealthappbe.service.SymptomService;
import com.example.myhealthappbe.entity.Symptom;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.tags.Tag;
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

    private final OrganService organService;

    @Override
    public ResponseEntity<Symptom> testSave(SymptomDto json) {

        log.info(json.name());

//        log.info("Json {} accepted", json);
//        Symptom symptom;
//        try{
//            symptom = objectMapper.readValue(json, Symptom.class);
//
//            // Process the symptom object
//        } catch (Exception e) {
//            log.error("Error processing symptom JSON data: {}", e.getMessage());
//            return ResponseEntity.badRequest().build();
//            // Handle the exception
//        }
//        log.info("Symptom '{}' was read successfully.", symptom.getName());
//
//        Organ organ = symptom.getOrgan();
//
//        organService.saveOrgan(organ);
//
//        organService.saveOrgan(symptom.getOrgan());
//
//        symptomService.saveSymptom(symptom);

        //log.info("Symptom already exists: " + symptomService.checkIfSymptomExists(symptom).isPresent());


        return ResponseEntity.ok().build();
    }
    }

