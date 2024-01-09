package com.utsav.animalmovement.animalmovement.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Movement {
    @Id
    @Column
    private int id;
    @Column(name = "company_id")
    private Integer companyId;
    @Column(name = "reason_id")
    private Integer reasonId;
    @Column(name = "species_id")
    private Integer speciesId;
    @Column(name = "origin_farm_id")
    private String originFarmId;
    @Column(name = "dest_farm_id")
    private String destFarmId;
    @Column(name = "number_moved")
    private Integer numberMoved;
    @Column
    private java.sql.Date date;

    @ManyToOne
    @JoinColumn(name = "origin_farm_id", insertable = false, updatable = false)
    private Farm origin_farm;

    @ManyToOne
    @JoinColumn(name = "dest_farm_id", insertable = false, updatable = false)
    private Farm destination_farm;

    @ManyToOne
    @JoinColumn(name = "company_id", insertable = false, updatable = false)
    private Company company;

    @ManyToOne
    @JoinColumn(name = "reason_id", insertable = false, updatable = false)
    private Reason reason;
    
    @ManyToOne
    @JoinColumn(name = "species_id", insertable = false, updatable = false)
    private Species species;
}
