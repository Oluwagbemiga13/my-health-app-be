package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.entity.Symptom;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(path = "/api/symptom")
public interface SymptomController {

    @PostMapping(consumes = "application/json" /*, produces = "application/json"*/)
    ResponseEntity<Symptom> testSave(@RequestBody String json);
}
