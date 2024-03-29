package com.location.location.controller;

import com.location.location.domain.CinemaHall;
import com.location.location.domain.City;
import com.location.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    @GetMapping("/getCities")
    public ResponseEntity<List<City>> getCities() {
         return ResponseEntity.ok(locationService.getCities());
    }
}
