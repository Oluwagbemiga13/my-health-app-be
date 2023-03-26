package com.example.myhealthappbe.service;

import com.example.myhealthappbe.repository.SymptomRepository;
import com.example.myhealthappbe.entity.Symptom;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class SymptomService {

    private final SymptomRepository symptomRepository;
    public void saveSymptom(Symptom symptom){
        symptomRepository.save(symptom);
        log.info("Symptom '{}' was saved successfully.", symptom.getName());
    }

}
