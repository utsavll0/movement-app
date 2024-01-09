package com.utsav.animalmovement.animalmovement.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.utsav.animalmovement.animalmovement.entity.Population;

public interface PopulationRepository extends CrudRepository<Population, String> {

    @Query(value = "SELECT SUM(population) from population", nativeQuery = true)
    public long getTotalPopulation();
}
