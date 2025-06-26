package org.terapi.backend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuarios")
public abstract class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(name = "fechaNacimiento", nullable = false)
    private String birthdate;
    @Column(nullable = false)
    private String password;
    @Column(name = "telefono", nullable = false)
    private String phone;

    @OneToMany(
            mappedBy = "user",
            cascade = { CascadeType.REMOVE },
            orphanRemoval = true
    )
    private List<Notification> notifications;
}
