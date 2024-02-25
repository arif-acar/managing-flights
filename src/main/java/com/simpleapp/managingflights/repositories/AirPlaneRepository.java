package com.airpline.managingflights.repositories;

import com.airpline.managingflights.model.AirPlane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AirPlaneRepository extends JpaRepository<AirPlane, Long> {
    Optional<AirPlane> findByFlightNumber(int flightNumber);
}
