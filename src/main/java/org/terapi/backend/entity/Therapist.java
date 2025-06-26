package org.terapi.backend.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.terapi.backend.entity.enums.Genre;
import org.terapi.backend.entity.enums.Languages;
import org.terapi.backend.entity.enums.Nationality;
import org.terapi.backend.entity.enums.Specialties;
import org.terapi.backend.util.LanguagesSetConverter;
import org.terapi.backend.util.SpecialtiesSetConverter;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "terapeutas")
public class Therapist extends User {
    @Column(name = "descripcion", nullable = false)
    private String description;
    @Column(name = "experiencia_anios", nullable = false)
    private Integer yearsExperience;
    @Column(name = "calificacion_promedio", nullable = false)
    private Double averageRating;
    @Convert(converter = SpecialtiesSetConverter.class)
    @Column(name = "especialidades", nullable = false)
    private Set<Specialties> specialties;
    @Convert(converter = LanguagesSetConverter.class)
    @Column(name = "idiomas", nullable = false)
    private Set<Languages> languages;
    @Enumerated(EnumType.STRING)
    @Column(name = "pais", nullable = false)
    private Nationality nationality;
    @Enumerated(EnumType.STRING)
    @Column(name = "genero", nullable = false)
    private Genre genre;

    @OneToMany(
            mappedBy = "therapist",
            cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE },
            orphanRemoval = true
    )
    private List<Schedule> schedules;

    @OneToMany(
            mappedBy = "therapist",
            cascade = { CascadeType.PERSIST, CascadeType.MERGE },
            orphanRemoval = true
    )
    private List<Review> reviews;

    @OneToMany(
            mappedBy = "therapist",
            cascade = { CascadeType.PERSIST, CascadeType.MERGE },
            orphanRemoval = true
    )
    private Set<Appointment> appointments;
}
