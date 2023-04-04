package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.SymptomDto;
import com.example.myhealthappbe.entity.Symptom;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping(path = "/symptom")
@Tag(name = "Symptom controller", description = "API for managing Symptoms")
public interface SymptomController {

    @PostMapping(consumes = "application/json")
    @Operation(summary = "Save Symptom", description = "Save a new Symptom")
    @ApiResponse(responseCode = "201", description = "Success", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "400", description = "Bad Request")
    ResponseEntity<Symptom> testSave(
            @RequestBody(description = "Symptom data to save", required = true,
                    content = @Content(mediaType = "application/json",
                            schema = @Schema(implementation = SymptomDto.class)))
            SymptomDto json);

}
