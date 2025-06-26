package org.terapi.backend.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.terapi.backend.entity.enums.Genre;
import org.terapi.backend.entity.enums.Languages;
import org.terapi.backend.entity.enums.Nacionality;
import org.terapi.backend.entity.enums.Specialties;
import org.terapi.backend.util.LanguagesSetConverter;
import org.terapi.backend.util.SpecialtiesSetConverter;

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
    @Column(name = "pais", nullable = false)
    private Nacionality nacionality;
    @Column(name = "genero", nullable = false)
    private Genre genre;
}
