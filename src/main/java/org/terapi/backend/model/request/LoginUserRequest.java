package org.terapi.backend.model.request;

import jakarta.validation.constraints.NotBlank;

public record LoginUserRequest(
        @NotBlank(message = "El campo email no puede estar vacío.")
        String email,
        @NotBlank(message = "El campo contraseña no puede estar vacío.")
        String password
) {
}
