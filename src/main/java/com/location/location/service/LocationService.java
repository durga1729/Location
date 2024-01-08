package com.location.location.service;

import com.location.location.domain.CinemaHall;
import com.location.location.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    City city;

    public List<CinemaHall> getCinemaHalls(String cityName) {
        return new ArrayList<>();
    }
}
