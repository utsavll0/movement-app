package com.utsav.animalmovement.animalmovement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.utsav.animalmovement.animalmovement.DTO.CountResult;
import com.utsav.animalmovement.animalmovement.service.FarmService;

@RestController
@CrossOrigin
@RequestMapping("/farm")
public class FarmController {
    @Autowired
    FarmService farmService;

    @GetMapping("/count")
    public ResponseEntity<CountResult> getFarmCount(){
        return new ResponseEntity<>(farmService.getTotalNumberOfFarms(), HttpStatus.OK);
    }

}
