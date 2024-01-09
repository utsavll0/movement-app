package com.utsav.animalmovement.animalmovement.service;

import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.Repository.PopulationRepository;
import com.utsav.animalmovement.animalmovement.entity.Population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PopulationService {

    @Autowired
    PopulationRepository populationRepository;

    public List<Population> getAllPopulation() {
        ArrayList<Population> populations = new ArrayList<>();
        populationRepository.findAll().forEach(populations::add);
        return populations;
    }

    public Population getPopulation(String id) {
        if (populationRepository.findById(id).isPresent()) {
            return populationRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public CountResult getTotalPopulation(){
        return new CountResult(populationRepository.getTotalPopulation());
    }
}
