package com.ybe.ybe_toyproject2.global.common;

public enum TripType {
    DOMESTIC(0, "DOMESTIC"), GLOBAL(1, "GLOBAL");

    private long id;
    private String type;

    TripType(long id, String type) {
        this.id = id;
        this.type = type;
    }
}
