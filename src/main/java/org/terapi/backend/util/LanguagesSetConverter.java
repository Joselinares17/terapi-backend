package org.terapi.backend.util;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Convert;
import org.terapi.backend.entity.enums.Languages;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@Convert
public class LanguagesSetConverter implements AttributeConverter<Set<Languages>, String> {
    @Override
    public String convertToDatabaseColumn(Set<Languages> languages) {
        if (languages == null || languages.isEmpty()) return "";
        return languages.stream().map(Enum::name).collect(Collectors.joining(","));
    }

    @Override
    public Set<Languages> convertToEntityAttribute(String dbData) {
        if (dbData == null || dbData.isEmpty()) return Set.of();
        return Arrays.stream(dbData.split(","))
                .map(String::trim)
                .map(Languages::valueOf)
                .collect(Collectors.toSet());
    }
}
