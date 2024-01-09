package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "population")
@Data
public class Population {

    @Id
    @Column(name="prem_id")
    private String premId;
    @Column(name="population")
    private Integer population;
}
