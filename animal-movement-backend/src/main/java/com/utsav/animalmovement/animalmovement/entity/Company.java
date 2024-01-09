package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Company {
    @Id
    @Column(name = "company_id")
    private Integer id;

    @Column(name = "company_name")
    private String name;
}
