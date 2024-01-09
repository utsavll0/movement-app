package com.utsav.animalmovement.animalmovement.DTO;

import java.sql.Date;
import com.utsav.animalmovement.animalmovement.entity.Company;
import com.utsav.animalmovement.animalmovement.entity.Farm;
import com.utsav.animalmovement.animalmovement.entity.Movement;
import com.utsav.animalmovement.animalmovement.entity.Reason;
import com.utsav.animalmovement.animalmovement.entity.Species;
import lombok.Data;

@Data
public class MovementResult {
    private Integer numbersMoved;
    private Date date;
    private Farm originFarm;
    private Farm destinationFarm;
    private Company company;
    private Reason reason;
    private Species species;

    public MovementResult(Movement movement){
        this.numbersMoved = movement.getNumberMoved();
        this.date = movement.getDate();
        this.originFarm = movement.getOrigin_farm();
        this.destinationFarm = movement.getDestination_farm();
        this.company = movement.getCompany();
        this.reason = movement.getReason();
        this.species = movement.getSpecies();
    }
}
