package com.example.myhealthappbe.service;

import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.repository.SymptomRepository;
import com.example.myhealthappbe.repository.OrganRepository;
import com.example.myhealthappbe.entity.Symptom;
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
    private final OrganRepository organRepository;

    private final EntityManagerFactory entityManagerFactory;

    @Transactional
    public void saveSymptom(Symptom symptom) {
        symptomRepository.save(symptom);
    }

    public void saveSystem(Organ organ) {
        organRepository.save(organ);
    }

    public Symptom findSymptomById(long id) {
        return symptomRepository.findById(id);
    }

    //TODO: Implement Optional.
    public Organ findSystemById(long id) {
        return organRepository.findById(id).get();
    }

    @Transactional
    public void addSymptomToSystem(Long systemId, Symptom symptom) {
        Optional<Organ> optionalSystem = organRepository.findById(systemId);
        if (optionalSystem.isPresent()) {
            Organ organ = optionalSystem.get();
            organ.getSymptoms().add(symptom);
            organRepository.save(organ);
        } else {
            throw new EntityNotFoundException("OrganDto not found with id " + systemId);
        }
    }

}
