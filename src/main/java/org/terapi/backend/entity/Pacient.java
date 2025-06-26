package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pacientes")
public class Pacient extends User {
    @CreationTimestamp
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime registrationDate;

    //TODO: Completar las relaciones entre entidades con: CITA, MÉTODOPAGO, HORARIO, RESEÑA y NOTIFICACIÓN
//    private Set<Appointment> appointments;
//    private Set<PaymentMethod> paymentMethods;
}
