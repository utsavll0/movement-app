package com.utsav.animalmovement.animalmovement.DTO;

import com.utsav.animalmovement.animalmovement.entity.Farm;

import lombok.Data;

@Data
public class AnimalMovementResult {
    public Farm farm;
    public Long totalMovedFrom;
    public Long totalMovedTo;

    public AnimalMovementResult(Farm farm, Long totalMovedFrom, Long totalMovedTo) {
        this.farm = farm;
        this.totalMovedFrom = totalMovedFrom;
        this.totalMovedTo = totalMovedTo;
    }
}
