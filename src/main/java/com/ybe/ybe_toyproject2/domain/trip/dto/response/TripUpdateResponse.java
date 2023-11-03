package com.ybe.ybe_toyproject2.domain.trip.dto.response;

import com.ybe.ybe_toyproject2.domain.trip.model.Trip;
import com.ybe.ybe_toyproject2.global.common.TripType;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripUpdateResponse {
    private String tripName;
    private LocalDateTime tripStartDate;
    private LocalDateTime tripEndDate;
    private TripType tripType;
    private Integer numberOfItinerary;

    public static TripUpdateResponse fromEntity(Trip trip, Integer numberOfItinerary){
        return TripUpdateResponse.builder()
                .tripName(trip.getTripName())
                .tripType(trip.getTripType())
                .tripStartDate(trip.getTripStartDate())
                .tripEndDate(trip.getTripEndDate())
                .numberOfItinerary(numberOfItinerary)
                .build();
    }
}
