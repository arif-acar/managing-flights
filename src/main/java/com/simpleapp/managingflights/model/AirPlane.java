package com.airpline.managingflights.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

//mark class as an Entity
@Entity
@Table
@Getter
@Setter
public class AirPlane {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column(unique = true)
    private int flightNumber;
    @Column
    private String model;

    public AirPlane() {
    }

    public AirPlane(String name, int flightNumber, String model) {
        this.name = name;
        this.flightNumber = flightNumber;
        this.model = model;
    }
}