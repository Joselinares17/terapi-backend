package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Genre {
    MALE("Hombre"),
    FEMALE("Mujer");

    private final String spanishLabel;

    Genre(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }
}
