package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "notificaciones")
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "mensaje", nullable = false)
    private String message;
    //TODO: Consultar a qué se refiere con fecha envío, es el momento de la creación?
    @Column(name = "fecha_envio", nullable = false)
    private LocalDate date;
    @Column(name = "vista", nullable = false)
    private boolean read;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
