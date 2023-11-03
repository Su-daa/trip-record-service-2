package com.ybe.ybe_toyproject2.domain.trip.dto.request;

import com.ybe.ybe_toyproject2.global.common.TripType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TripUpdateRequest {
    @NotBlank //null이 아니어야 하고 최소 하나의 문자 있어야 함.
    private String tripName;
    @NotNull
    private LocalDateTime tripStartDate;
    @NotNull
    private LocalDateTime tripEndDate;
    @NotNull
    private TripType tripType;

}
