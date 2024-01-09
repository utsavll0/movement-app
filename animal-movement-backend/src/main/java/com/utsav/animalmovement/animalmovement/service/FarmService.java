package com.utsav.animalmovement.animalmovement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.Repository.FarmRepository;
import com.utsav.animalmovement.animalmovement.entity.Farm;

@Service
public class FarmService {

    @Autowired
    FarmRepository farmRepository;

    public List<Farm> getAllFarms() {
        return farmRepository.findAll();
    }

    public Farm getFarm(String premId) {
        if (farmRepository.findById(premId).isPresent()) {
            return farmRepository.findById(premId).get();
        } else {
            return null;
        }
    }

    public CountResult getTotalNumberOfFarms() {
        return new CountResult(farmRepository.count());
    }
}
