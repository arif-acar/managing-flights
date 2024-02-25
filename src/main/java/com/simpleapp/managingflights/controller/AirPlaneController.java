package com.airpline.managingflights.controller;

import com.airpline.managingflights.dto.AirPlaneDto;
import com.airpline.managingflights.service.AirPlaneService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/airplane")
@RequiredArgsConstructor
public class AirPlaneController {

        private final AirPlaneService airPlaneService;

        @GetMapping("/{flightNumber}")
        public AirPlaneDto getAirPlaneByFlightNumber(@PathVariable int flightNumber) {
            return airPlaneService.getAirPlaneByFlightNumber(flightNumber);
        }


    @PostMapping("")
    public AirPlaneDto createAirPlane(@RequestBody AirPlaneDto airPlaneDto) {
        return airPlaneService.addAirPlane(airPlaneDto);
    }

}
