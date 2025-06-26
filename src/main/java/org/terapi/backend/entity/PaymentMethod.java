package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.terapi.backend.entity.enums.DocumentType;
import org.terapi.backend.entity.enums.TypePayment;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "metodos_pagos")
public class PaymentMethod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo" , nullable = false)
    private TypePayment typePayment;
    @Column(name = "numero_tarjeta" , nullable = false)
    private String cardNumber;
    @Column(name = "vencimiento" , nullable = false)
    private LocalDate expirationDate;
    @Column(name = "nombre_titular" , nullable = false)
    private String cardholderName;
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_documento" , nullable = false)
    private DocumentType documentType;
    @Column(name = "numero_documento" , nullable = false)
    private String documentNumber;
}
