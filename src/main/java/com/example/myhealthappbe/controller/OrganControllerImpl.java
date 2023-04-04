package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.OrganDto;
import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.entity.Symptom;
import com.example.myhealthappbe.mapper.OrganMapper;
import com.example.myhealthappbe.service.OrganService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.core.util.Json;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequiredArgsConstructor
@Slf4j
public class OrganControllerImpl implements OrganController {

    private final OrganService organService;

    private final ObjectMapper objectMapper;

    private final OrganMapper organMapper;

    @Override
    public ResponseEntity<OrganDto> testSave(OrganDto organDto) {


        log.info("Json {} accepted", organDto);
//        Organ organ ;
//        try{
//            //organ = objectMapper.readValue(organDto, Organ.class);
//            //organ = Organ.builder().name(organDto.name()).build();
//            organ = new Organ(organDto.name());
//            //organ = organMapper.toEntity(organDto);
//
//            // Process the symptom object
//        } catch (Exception e) {
//            log.error("Error processing symptom JSON data: {}", e.getMessage());
//            return ResponseEntity.badRequest().build();
//            // Handle the exception
//        }
//        log.info("Organ '{}' was read successfully.", organ.getName());
//
//        organService.saveOrgan(organ);

        return ResponseEntity.ok().build();
    }


}
