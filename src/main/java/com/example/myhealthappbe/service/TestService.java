package com.example.myhealthappbe.service;

import com.example.myhealthappbe.repository.SymptomRepository;
import com.example.myhealthappbe.repository.SystemRepository;
import com.example.myhealthappbe.sympthoms.Symptom;
import com.example.myhealthappbe.sympthoms.System;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor

public class TestService {

    private final SymptomRepository symptomRepository;
    private final SystemRepository systemRepository;

    @Transactional
    public void saveSymptom(Symptom symptom){
        symptomRepository.save(symptom);
    }

    public void saveSystem(System system){
        systemRepository.save(system);
    }

    public Symptom findById(long id){
        return symptomRepository.findById(id);
    }


}
