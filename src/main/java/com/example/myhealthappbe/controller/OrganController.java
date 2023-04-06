package com.example.myhealthappbe.controller;

import com.example.myhealthappbe.dto.independent.OrganDto;
import com.example.myhealthappbe.dto.related.OrganWithSymptomsDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/organ")
@Tag(name = "OrganDto controller", description = "API for managing Symptoms")
public interface OrganController {

    @PostMapping(consumes = "application/json")
    @Operation(summary = "Save OrganDto", description = "Save a new OrganDto")
    @ApiResponse(responseCode = "201", description = "Success", content = @Content(mediaType = "application/json"))
    @ApiResponse(responseCode = "400", description = "Bad Request")
    ResponseEntity<OrganDto> testSave(@Validated @RequestBody OrganDto organDto);

}
