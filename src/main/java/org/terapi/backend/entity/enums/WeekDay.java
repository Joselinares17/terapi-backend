package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum WeekDay {
    MONDAY("Lunes"),
    TUESDAY("Martes"),
    WEDNESDAY("Miercoles"),
    THURSDAY("Jueves"),
    FRIDAY("Viernes"),
    SATURDAY("Sabado");

    private final String spanishLabel;

    WeekDay(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }
}
