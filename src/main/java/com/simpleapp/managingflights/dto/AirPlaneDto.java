package com.airpline.managingflights.dto;

import lombok.*;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class AirPlaneDto {
    private String name;
    private int flightNumber;
    private String model;
}

