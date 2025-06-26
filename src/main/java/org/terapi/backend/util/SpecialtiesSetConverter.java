package org.terapi.backend.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.terapi.backend.entity.enums.Specialties;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Converter
public class SpecialtiesSetConverter implements AttributeConverter<Set<Specialties>, String> {

    @Override
    public String convertToDatabaseColumn(Set<Specialties> specialties) {
        if (specialties == null || specialties.isEmpty()) return "";
        return specialties.stream().map(Enum::name).collect(Collectors.joining(","));
    }

    @Override
    public Set<Specialties> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isBlank()) return Set.of();
        return Arrays.stream(dbData.split(","))
                .map(String::trim)
                .map(Specialties::valueOf)
                .collect(Collectors.toSet());
    }
}
