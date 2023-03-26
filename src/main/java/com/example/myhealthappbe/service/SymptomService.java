package com.example.myhealthappbe.service;

import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.repository.SymptomRepository;
import com.example.myhealthappbe.entity.Symptom;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SymptomService {

    public Optional checkIfExists(Symptom symptom){
        return Optional.of(symptomRepository.findOne(Example.of(symptom)));
    }

    private final SymptomRepository symptomRepository;
    public void saveSymptom(Symptom symptom){
        symptomRepository.save(symptom);
        log.info("Symptom '{}' was saved successfully.", symptom.getName());
    }


//    public Optional<Symptom> checkIfSymptomExists(Symptom symptom){
//        Optional optional = symptomRepository.findSymptomsByNameAndSystem(symptom.getName(), symptom.getOrgan().getName()).get(0);
//
//        return optional;
//    }

}
