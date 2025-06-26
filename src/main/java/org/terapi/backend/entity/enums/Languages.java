package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Languages {
    SPANISH("Espanol"),
    ENGLISH("Ingles");

    private final String spanishLabel;

    Languages(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }
}
