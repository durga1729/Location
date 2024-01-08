package com.location.location.controller;

import com.location.location.domain.CinemaHall;
import com.location.location.domain.City;
import com.location.location.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LocationController {

    @Autowired
    LocationService locationService;

    public ResponseEntity<List<CinemaHall>> getCity(@PathVariable String cityName) {
         return ResponseEntity.ok(locationService.getCinemaHalls(cityName));
    }
}
