package com.utsav.animalmovement.animalmovement.DTO;

import lombok.Data;

@Data
public class MovementCountDTO {
    private String farmId;
    private Long totalMovedFrom;
    private Long totalMovedTo;
}
