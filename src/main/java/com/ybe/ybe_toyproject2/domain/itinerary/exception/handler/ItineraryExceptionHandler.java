package com.ybe.ybe_toyproject2.domain.itinerary.exception.handler;

import com.ybe.ybe_toyproject2.domain.itinerary.exception.InvalidItineraryScheduleException;
import com.ybe.ybe_toyproject2.domain.itinerary.exception.ItineraryNotFoundException;
import com.ybe.ybe_toyproject2.global.error.response.ErrorResponse;

import lombok.extern.slf4j.Slf4j;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import static org.springframework.http.HttpStatus.CONFLICT;

@Slf4j
@RestControllerAdvice
public class ItineraryExceptionHandler {
    @ExceptionHandler(ItineraryNotFoundException.class)
    protected final ResponseEntity<ErrorResponse> handleItineraryException(
            ItineraryNotFoundException ex, WebRequest request) {
        return new ResponseEntity<>(ErrorResponse.builder()
                .errorCode(CONFLICT.value())
                .message(ex.getMessage())
                .build()
                , CONFLICT);
    }

    @ExceptionHandler(InvalidItineraryScheduleException.class)
    protected final ResponseEntity<ErrorResponse> handleItineraryException(
            InvalidItineraryScheduleException ex, WebRequest request) {
        return new ResponseEntity<>(ErrorResponse.builder()
                .errorCode(CONFLICT.value())
                .message(ex.getMessage())
                .build()
                , CONFLICT);
    }
}