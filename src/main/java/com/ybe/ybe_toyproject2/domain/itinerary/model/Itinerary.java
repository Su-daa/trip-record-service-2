package com.ybe.ybe_toyproject2.domain.itinerary.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ybe.ybe_toyproject2.domain.trip.model.Trip;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Itinerary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "itinerary_id")
    private Long id;
    private String itineraryName;
    private String transportation;
    private String departCity;
    private String arriveCity;
    private LocalDateTime cityDepartTime;
    private LocalDateTime cityArriveTime;
    private String accommodation;
    private LocalDateTime checkInTime;
    private LocalDateTime checkOutTime;
    private String placeName;
    private LocalDateTime placeArriveTime;
    private LocalDateTime placeDepartTime;

    // @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "trip_id")
    private Trip trip;

    @Builder
    public Itinerary(String itineraryName, String transportation, String departCity, String arriveCity, LocalDateTime cityDepartTime, LocalDateTime cityArriveTime, String accommodation, LocalDateTime checkInTime, LocalDateTime checkOutTime, String placeName, LocalDateTime placeArriveTime, LocalDateTime placeDepartTime) {
        this.itineraryName = itineraryName;
        this.transportation = transportation;
        this.departCity = departCity;
        this.arriveCity = arriveCity;
        this.cityDepartTime = cityDepartTime;
        this.cityArriveTime = cityArriveTime;
        this.accommodation = accommodation;
        this.checkInTime = checkInTime;
        this.checkOutTime = checkOutTime;
        this.placeName = placeName;
        this.placeDepartTime = placeDepartTime;
        this.placeArriveTime = placeArriveTime;
    }

    public void add(Trip trip) {
        this.trip = trip;
    }

}
