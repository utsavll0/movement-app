package com.utsav.animalmovement.animalmovement.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.utsav.animalmovement.animalmovement.entity.Farm;

public interface FarmRepository extends CrudRepository<Farm, String> {
    public List<Farm> findAll();

    @Query(value = "SELECT * FROM farm WHERE prem_id = ?1", nativeQuery = true)
    public Farm find(String id);
}
