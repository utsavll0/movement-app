package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Species {
    @Id
    @Column
    private Integer id;

    @Column
    private String species;
}
