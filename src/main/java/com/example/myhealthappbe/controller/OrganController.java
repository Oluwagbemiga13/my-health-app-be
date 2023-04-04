package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.OrganDto;
import com.example.myhealthappbe.entity.Organ;
import com.example.myhealthappbe.entity.Symptom;
import io.swagger.v3.core.util.Json;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/organ")
@Tag(name = "Organ controller", description = "API for managing Symptoms")
public interface OrganController {

    @PostMapping(consumes = "application/json")
    @Operation(summary = "Save Organ", description = "Save a new Organ")
    @ApiResponse(responseCode = "201", description = "Success", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "400", description = "Bad Request")
    ResponseEntity<OrganDto> testSave(
            @Validated @RequestBody(description = "Organ data to save", required = true,
                    content = @Content(mediaType = "application/json"/*,
                            schema = @Schema(implementation = OrganDto.class)*/))
            OrganDto organDto);

}
