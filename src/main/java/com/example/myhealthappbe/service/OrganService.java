package com.example.myhealthappbe.service;

import com.example.myhealthappbe.entity.related.Organ;
import com.example.myhealthappbe.entity.related.Symptom;
import com.example.myhealthappbe.repository.OrganRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrganService {
    private final OrganRepository organRepository;

    public void saveOrgan(Organ organ) {
        if (organRepository.existsByName(organ.getName())) {
            log.info("OrganDto {} already exists. Skipping.", organ);
            return;
        }
        Organ createdOrgan = Organ.builder().name(organ.getName()).build();
        organRepository.save(createdOrgan);
        log.info("OrganDto {} saved.", organ);
    }

    public Organ findByName(String name) {
        return organRepository.findByName(name);
    }

    public static Symptom createSymptomFromJson(String json) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.readValue(json, new TypeReference<Map<String, Object>>() {
        });

        String name = (String) map.get("name");
        List<Map<String, Object>> organMaps = (List<Map<String, Object>>) map.get("organ");

        List<Organ> organList = new ArrayList<>();
        for (Map<String, Object> organMap : organMaps) {
            //long organId = ((Number) organMap.get("id")).longValue();
            String organName = (String) organMap.get("name");
            organList.add(Organ.builder()/*.id(organId)*/.name(organName).build());
        }

        return Symptom.builder().name(name).build();
    }
}

