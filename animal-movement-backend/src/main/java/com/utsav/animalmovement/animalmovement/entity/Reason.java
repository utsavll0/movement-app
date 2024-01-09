package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Reason {
    @Id
    @Column
    private Integer id;

    @Column
    private String reason;
}
