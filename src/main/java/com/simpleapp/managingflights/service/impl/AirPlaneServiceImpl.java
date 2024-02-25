package com.airpline.managingflights.service.impl;

import com.airpline.managingflights.dto.AirPlaneDto;
import com.airpline.managingflights.model.AirPlane;
import com.airpline.managingflights.repositories.AirPlaneRepository;
import com.airpline.managingflights.service.AirPlaneService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class AirPlaneServiceImpl implements AirPlaneService {

    private final AirPlaneRepository airPlaneRepository;

    @Override
    public AirPlaneDto addAirPlane(AirPlaneDto airPlaneDto) {
        AirPlane airPlane = airPlaneRepository.save(new AirPlane(
                airPlaneDto.getName(),
                airPlaneDto.getFlightNumber(),
                airPlaneDto.getModel()));

        AirPlaneServiceImpl.log.info("Airplane added: {}", airPlane);

        return AirPlaneDto.builder()
                .name(airPlane.getName())
                .flightNumber(airPlane.getFlightNumber())
                .model(airPlane.getModel())
                .build();
    }

    @Override
    public AirPlaneDto getAirPlaneByFlightNumber(int flightNumber) {
        var airPlane = airPlaneRepository.findByFlightNumber(flightNumber);
        return airPlane.map(plane -> AirPlaneDto.builder()
                .name(plane.getName())
                .flightNumber(plane.getFlightNumber())
                .model(plane.getModel())
                .build())
                .orElse(null);
    }
}
