package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum AppointmentStatus {
    SCHEDULED("Agendada"),
    CONFIRMED("Confirmada"),
    CANCELLED("Cancelada"),
    COMPLETED("Completada");

    private final String spanishLabel;

    AppointmentStatus(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }

}
