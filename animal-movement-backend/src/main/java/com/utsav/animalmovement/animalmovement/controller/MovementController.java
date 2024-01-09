package com.utsav.animalmovement.animalmovement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.utsav.animalmovement.animalmovement.DTO.AnimalMovementResult;
import com.utsav.animalmovement.animalmovement.DTO.CompanyMovementResult;
import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.DTO.MovementResult;
import com.utsav.animalmovement.animalmovement.DTO.SpeciesResult;
import com.utsav.animalmovement.animalmovement.service.MovementService;

@RestController
@CrossOrigin
@RequestMapping("/movement")
public class MovementController {

    @Autowired
    private MovementService movementService;

    @GetMapping("/")
    public ResponseEntity<List<MovementResult>> getAllMovement() {
        List<MovementResult> movements = movementService.getAllMovement();
        if (!movements.isEmpty()) {
            return new ResponseEntity<>(movements, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/count")
    public ResponseEntity<CountResult> getTotalAnimalsMoved() {
        return new ResponseEntity<>(movementService.getTotalAnimalsMoved(), HttpStatus.OK);
    }

    @GetMapping("/total")
    public ResponseEntity<List<AnimalMovementResult>> getAllAnimalMovement(){
        return new ResponseEntity<>(movementService.getAnimalsMovedFromAndTo(), HttpStatus.OK);
    }

    @GetMapping("/species")
    public ResponseEntity<List<SpeciesResult>> getAllSpeciesCount() {
        return new ResponseEntity<>(movementService.getSpeciesCount(), HttpStatus.OK);
    }

    @GetMapping("/company")
    public ResponseEntity<List<CompanyMovementResult>> getAllCompanyMovementCount() {
        return new ResponseEntity<>(movementService.getCompanyMovementCount(), HttpStatus.OK);
    }
}
