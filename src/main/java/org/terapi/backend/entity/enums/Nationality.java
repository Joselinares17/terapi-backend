package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Nationality {
    PERUVIAN("Peruano", "Peru"),
    US_AMERICAN("Estado unidense", "Estados unidos");

    private final String spanishLabel;
    private final String country;

    Nationality(String spanishLabel, String country) {
        this.spanishLabel = spanishLabel;
        this.country = country;
    }
}
