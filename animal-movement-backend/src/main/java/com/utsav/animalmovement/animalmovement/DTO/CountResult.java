package com.utsav.animalmovement.animalmovement.DTO;

import lombok.Data;

@Data
public class CountResult {
    private long count;

    public CountResult(long count) {
        this.count = count;
    }
}
