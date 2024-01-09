package com.utsav.animalmovement.animalmovement.DTO;

import com.utsav.animalmovement.animalmovement.entity.Species;

import lombok.Data;

@Data
public class SpeciesResult {
    private Species species;
    private Integer count;

    public SpeciesResult(Species species, Integer count) {
        this.species = species;
        this.count = count;
    }
}
