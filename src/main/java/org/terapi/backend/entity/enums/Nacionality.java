package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Nacionality {
    PERUVIAN("Peruano", "Peru"),
    US_AMERICAN("Estado unidense", "Estados unidos");

    private final String spanishLabel;
    private final String country;

    Nacionality(String spanishLabel, String country) {
        this.spanishLabel = spanishLabel;
        this.country = country;
    }
}
