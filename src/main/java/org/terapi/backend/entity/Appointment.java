package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.terapi.backend.entity.enums.AppointmentStatus;
import org.terapi.backend.entity.enums.Mode;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "citas")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fecha", nullable = false)
    private LocalDate date;
    @Column(name = "hora", nullable = false)
    private LocalTime time;
    @Column(name = "tipo", nullable = false)
    @Enumerated(EnumType.STRING)
    private AppointmentStatus appointmentStatus;
    @Column(name = "tarifa", nullable = false)
    private BigDecimal fee;
    @Column(name = "duracion", nullable = false)
    private Duration duration;
    @Column(name = "modalidad", nullable = false)
    @Enumerated(EnumType.STRING)
    private Mode mode;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "terapeuta_id")
    private Therapist therapist;
}
