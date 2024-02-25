package com.airpline.managingflights.service;

import com.airpline.managingflights.dto.AirPlaneDto;

public interface AirPlaneService {
     AirPlaneDto addAirPlane(AirPlaneDto airPlaneDto);
     AirPlaneDto getAirPlaneByFlightNumber(int flightNumber);
}
