package com.ybe.ybe_toyproject2.domain.trip.repository;

import com.ybe.ybe_toyproject2.domain.trip.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    Optional<Trip> findById(Long tripId);

    Boolean existsByTripName(String tripName);

    Integer countTripByIdAndTripName(Long tripId, String tripName);
}
