package com.utsav.animalmovement.animalmovement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.utsav.animalmovement.animalmovement.DTO.AnimalMovementResult;
import com.utsav.animalmovement.animalmovement.DTO.AnimalMovementRepoDTO;
import com.utsav.animalmovement.animalmovement.DTO.CompanyMovementResult;
import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.DTO.MovementResult;
import com.utsav.animalmovement.animalmovement.DTO.SpeciesCountDTO;
import com.utsav.animalmovement.animalmovement.DTO.SpeciesResult;
import com.utsav.animalmovement.animalmovement.Repository.FarmRepository;
import com.utsav.animalmovement.animalmovement.Repository.MovementRepository;
import com.utsav.animalmovement.animalmovement.Repository.SpeciesRepository;
import com.utsav.animalmovement.animalmovement.entity.Movement;

@Service
public class MovementService {
    @Autowired
    private MovementRepository movementRepository;
    @Autowired
    private FarmRepository farmRepository;
    @Autowired
    private SpeciesRepository speciesRepository;

    public List<MovementResult> getAllMovement() {
        List<Movement> movements = movementRepository.findAll();
        List<MovementResult> movementDTOs = new ArrayList<MovementResult>();
        for (Movement movement : movements) {
            movementDTOs.add(new MovementResult(movement));
        }
        return movementDTOs;
    }

    public CountResult getTotalAnimalsMoved() {
        return new CountResult(movementRepository.getTotalAnimalsMoved());
    }

    public List<AnimalMovementResult> getAnimalsMovedFromAndTo() {
        List<AnimalMovementRepoDTO> movementCount = movementRepository.getAnimalMovement();
        List<AnimalMovementResult> animalMovements = new ArrayList<>();
        for (AnimalMovementRepoDTO movement : movementCount) {
            animalMovements.add(new AnimalMovementResult(farmRepository.find(movement.getFarmId()), movement.getTotalMovedFrom(), movement.getTotalMovedTo()));
        }
        return animalMovements;
    }

    public List<SpeciesResult> getSpeciesCount() {
        List<SpeciesCountDTO> speciesCounts = movementRepository.getSpeciesCount();
        List<SpeciesResult> result = new ArrayList<>();
        for (SpeciesCountDTO speciesCount : speciesCounts) {
            result.add(new SpeciesResult(speciesRepository.find(speciesCount.getSpeciesId()), speciesCount.getCount()));
        }
        return result;
    }

    public List<CompanyMovementResult> getCompanyMovementCount() {
        return movementRepository.getCompanyMovementCount();
    }
}
