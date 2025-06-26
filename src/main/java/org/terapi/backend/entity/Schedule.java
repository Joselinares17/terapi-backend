package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.terapi.backend.entity.enums.WeekDay;

import java.time.LocalTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "horarios")
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dia_semana", nullable = false)
    private WeekDay weekDay;
    //TODO: Consultar si un horario se crea al momento o se asigna en un periodo.
    @Column(name = "hora_inicio", nullable = false)
    private LocalTime startTime;
    @Column(name = "hora_fin", nullable = false)
    private LocalTime endTime;
}
