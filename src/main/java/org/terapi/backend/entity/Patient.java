package org.terapi.backend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
public class Patient extends User {
    @CreationTimestamp
    @Column(name = "fecha_registro", nullable = false)
    private LocalDateTime registrationDate;

    @OneToMany(
            mappedBy = "patient",
            cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE },
            orphanRemoval = true
    )
    private Set<Appointment> appointments;

    @OneToMany(
            mappedBy = "patient",
            cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE},
            orphanRemoval = true
    )
    private Set<PaymentMethod> paymentMethods;

    @OneToMany(
            mappedBy = "patient",
            cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE},
            orphanRemoval = true
    )
    private Set<Review> reviews;
}
