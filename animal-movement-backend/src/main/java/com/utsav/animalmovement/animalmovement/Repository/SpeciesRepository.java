package com.utsav.animalmovement.animalmovement.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.utsav.animalmovement.animalmovement.entity.Species;

public interface SpeciesRepository extends CrudRepository<Species, Integer> {
    @Query(value = "SELECT * from species where id = ?1", nativeQuery = true)
    public Species find(Integer id);
}
