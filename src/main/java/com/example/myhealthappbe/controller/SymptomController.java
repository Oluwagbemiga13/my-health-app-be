package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.independent.SymptomDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping(path = "/symptom")
@Tag(name = "Symptom controller", description = "API for managing Symptoms")
public interface SymptomController {

    @PostMapping(consumes = "application/json")
    @Operation(summary = "Save Symptom", description = "Save a new Symptom")
    @ApiResponse(responseCode = "201", description = "Success", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "400", description = "Bad Request")
    ResponseEntity<SymptomDto> testSave( @RequestBody SymptomDto json);

    @GetMapping(path = "/{id}", produces = "application/json")
    @Operation(summary = "Find Symptom by ID", description = "Find Symptom by ID")
    @ApiResponse(responseCode = "200", description = "Success", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "400", description = "Bad Request")
    public ResponseEntity<SymptomDto> findById(@PathVariable("id") String id);

}
