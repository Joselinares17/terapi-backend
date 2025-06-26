package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum DocumentType {
    DNI("Dni"),
    PASSPORT("Pasaporte"),
    FOREIGNERCARD("Carnet de extranjeria");

    private final String SpanishLabel;

    DocumentType(String spanishLabel) {
        this.SpanishLabel = spanishLabel;
    }
}
