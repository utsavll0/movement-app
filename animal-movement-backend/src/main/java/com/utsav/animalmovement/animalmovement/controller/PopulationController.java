package com.utsav.animalmovement.animalmovement.controller;

import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.service.PopulationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/population")
@CrossOrigin
public class PopulationController {

    @Autowired
    PopulationService populationService;

    @GetMapping("/count")
    private ResponseEntity<CountResult> getTotalPopulations() {
        return new ResponseEntity<>(populationService.getTotalPopulation(), HttpStatus.OK);
    }

}
