package com.ybe.ybe_toyproject2.domain.itinerary.dto.response;

import com.ybe.ybe_toyproject2.domain.itinerary.model.Itinerary;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItineraryResponse {
    private Long itineraryId;
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

    public static ItineraryResponse fromEntity(Itinerary itinerary) {
        return ItineraryResponse.builder()
                .itineraryId(itinerary.getId())
                .itineraryName(itinerary.getItineraryName())
                .transportation(itinerary.getTransportation())
                .departCity(itinerary.getDepartCity())
                .arriveCity(itinerary.getArriveCity())
                .cityDepartTime(itinerary.getCityDepartTime())
                .cityArriveTime(itinerary.getCityArriveTime())
                .accommodation(itinerary.getAccommodation())
                .checkInTime(itinerary.getCheckInTime())
                .checkOutTime(itinerary.getCheckOutTime())
                .placeName(itinerary.getPlaceName())
                .placeDepartTime(itinerary.getPlaceDepartTime())
                .placeArriveTime(itinerary.getPlaceArriveTime())
                .build();
    }
}
