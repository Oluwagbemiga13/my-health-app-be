package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.entity.Symptom;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RequestMapping(path = "/api/symptom")
public interface SymptomController {

    @PostMapping(consumes = "application/json" /*, produces = "application/json"*/)
    ResponseEntity<Symptom> testSave(@RequestBody String json);
}
