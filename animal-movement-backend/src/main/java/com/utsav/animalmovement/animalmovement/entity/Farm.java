package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "farm")
@Data
public class Farm {
    @Id
    @Column(name = "prem_id")
    private String id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String state;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "lat")
    private BigDecimal latitude;
    @Column(name = "long")
    private BigDecimal longitude;

    @OneToOne
    @JoinColumn(name = "prem_id", referencedColumnName = "prem_id")
    private Population population;
}
