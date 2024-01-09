package com.utsav.animalmovement.animalmovement.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.utsav.animalmovement.animalmovement.DTO.AnimalMovementRepoDTO;
import com.utsav.animalmovement.animalmovement.DTO.CompanyMovementResult;
import com.utsav.animalmovement.animalmovement.DTO.SpeciesCountDTO;
import com.utsav.animalmovement.animalmovement.entity.Movement;

import java.util.List;

public interface MovementRepository extends CrudRepository<Movement, Integer> {
    public List<Movement> findAll();

    @Query(value = "SELECT sum(number_moved) from movement", nativeQuery = true)
    public long getTotalAnimalsMoved();

    @Query(value = "with a as (select sum(number_moved) as total_moved_from, origin_farm_id from movement group by origin_farm_id), b as (select sum(number_moved) as total_moved_to, dest_farm_id from movement group by dest_farm_id), c as (select total_moved_from, total_moved_to, a.origin_farm_id from a join b on a.origin_farm_id = b.dest_farm_id) select total_moved_from as totalMovedFrom, total_moved_to as totalMovedTo, a.origin_farm_id as farmId from a join b on a.origin_farm_id = b.dest_farm_id order by farmId", nativeQuery = true)
    public List<AnimalMovementRepoDTO> getAnimalMovement();

    @Query(value = "select species_id as speciesId ,sum(number_moved) as count from movement group by species_id", nativeQuery = true)
    public List<SpeciesCountDTO> getSpeciesCount();

    @Query(value = "with a as (select company_id, sum(number_moved) from movement group by company_id) select a.company_id as companyId, sum as animalMoved, c.company_name as companyName from a join company c on a.company_id = c.company_id", nativeQuery = true)
    public List<CompanyMovementResult> getCompanyMovementCount();
}
