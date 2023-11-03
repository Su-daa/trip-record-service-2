package com.ybe.ybe_toyproject2.domain.trip.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.ybe.ybe_toyproject2.domain.itinerary.model.Itinerary;
import com.ybe.ybe_toyproject2.global.common.TripType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter@Setter
public class Trip {
    @Id
    @Column(name = "trip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tripName;
    private LocalDateTime tripStartDate;
    private LocalDateTime tripEndDate;
    @Enumerated(EnumType.STRING)
    private TripType tripType;

    // @JsonManagedReference
    @OneToMany(mappedBy = "trip", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private List<Itinerary> itineraryList = new ArrayList<>();

    @Builder
    public Trip(String tripName, LocalDateTime tripStartDate, LocalDateTime tripEndDate, TripType tripType) {
        this.tripName = tripName;
        this.tripStartDate = tripStartDate;
        this.tripEndDate = tripEndDate;
        this.tripType = tripType;
    }
}
