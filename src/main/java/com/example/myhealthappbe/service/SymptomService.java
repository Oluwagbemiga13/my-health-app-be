package com.example.myhealthappbe.service;

import com.example.myhealthappbe.entity.indipendent.SymptomInd;
import com.example.myhealthappbe.entity.related.Symptom;
import com.example.myhealthappbe.repository.SymptomIndRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class SymptomService {
    private final SymptomIndRepository symptomIndRepository;

    public Optional checkIfExists(SymptomInd symptom) {
        return Optional.of(symptomIndRepository.findOne(Example.of(symptom)));
    }

    public void saveSymptom(SymptomInd symptom) {
        symptomIndRepository.save(symptom);
        log.info("Symptom '{}' was saved successfully.", symptom.getName());
    }


//    public Optional<Symptom> checkIfSymptomExists(Symptom symptom){
//        Optional optional = symptomIndRepository.findSymptomsByNameAndSystem(symptom.getName(), symptom.getOrgan().getName()).get(0);
//
//        return optional;
//    }

}
