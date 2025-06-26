package org.terapi.backend.model.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

public record RegisterPatientRequest(
        @NotBlank(message = "El campo nombre completo no puede estar vacío.")
        String name,
        @Email
        @NotEmpty
        @NotBlank(message = "El campo email no puede estar vacío.")
        String email,
        @NotBlank(message = "El campo password no puede estar vacío.")
        String password,
        @NotBlank(message = "El campo confirmar contraseña no puede estar vacío.")
        String confirmPassword
) {
}
