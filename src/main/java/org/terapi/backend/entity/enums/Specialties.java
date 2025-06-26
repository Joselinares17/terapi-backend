package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum Specialties {
    PSYCHOLOGY("Psicologia"),
    PHYSIOTHERAPY("Fisioterapia"),
    OCCUPATIONAL_THERAPY("Terapia ocupacional"),
    SPEECH_THERAPY("Logopedia");

    private final String SpanishLabel;

    Specialties(String spanishLabel) {
        this.SpanishLabel = spanishLabel;
    }
}
