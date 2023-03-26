package com.example.myhealthappbe.service;

import com.example.myhealthappbe.repository.SymptomRepository;
import com.example.myhealthappbe.repository.SystemRepository;
import com.example.myhealthappbe.entity.Symptom;
import com.example.myhealthappbe.entity.System;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TestService {

    private final SymptomRepository symptomRepository;
    private final SystemRepository systemRepository;

    private final EntityManagerFactory entityManagerFactory;

    @Transactional
    public void saveSymptom(Symptom symptom) {
        symptomRepository.save(symptom);
    }

    public void saveSystem(System system) {
        systemRepository.save(system);
    }

    public Symptom findSymptomById(long id) {
        return symptomRepository.findById(id);
    }

    //TODO: Implement Optional.
    public System findSystemById(long id) {
        return systemRepository.findById(id).get();
    }

    @Transactional
    public void addSymptomToSystem(Long systemId, Symptom symptom) {
        Optional<System> optionalSystem = systemRepository.findById(systemId);
        if (optionalSystem.isPresent()) {
            System system = optionalSystem.get();
            system.getSymptoms().add(symptom);
            systemRepository.save(system);
        } else {
            throw new EntityNotFoundException("System not found with id " + systemId);
        }
    }

}
