package com.example.myhealthappbe.service;

import com.example.myhealthappbe.entity.indipendent.SymptomInd;
import com.example.myhealthappbe.entity.related.Organ;
import com.example.myhealthappbe.repository.SymptomIndRepository;
import com.example.myhealthappbe.repository.OrganRepository;
import com.example.myhealthappbe.entity.related.Symptom;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor

public class TestService {

    private final SymptomIndRepository symptomIndRepository;
    private final OrganRepository organRepository;

    private final EntityManagerFactory entityManagerFactory;

    @Transactional
    public void saveSymptom(SymptomInd symptom) {
        symptomIndRepository.save(symptom);
    }

    public void saveSystem(Organ organ) {
        organRepository.save(organ);
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
