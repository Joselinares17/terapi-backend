package org.terapi.backend.entity.enums;

import lombok.Getter;

@Getter
public enum TypePayment {
    CREDIT_CARD("Tarjeta de credito"),
    BANK_TRANSFER("Transferencia bancaria"),
    CASH("Efectivo");
    private final String spanishLabel;

    TypePayment(String spanishLabel) {
        this.spanishLabel = spanishLabel;
    }
}
