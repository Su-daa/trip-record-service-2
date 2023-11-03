package com.ybe.ybe_toyproject2.domain.itinerary.repository;

import com.ybe.ybe_toyproject2.domain.itinerary.model.Itinerary;
import com.ybe.ybe_toyproject2.domain.trip.model.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ItineraryRepository extends JpaRepository<Itinerary, Long> {
    Optional<List<Itinerary>> findItinerariesByTripId(Long tripId);
    Optional<Itinerary> findById(Long itineraryId);
}
