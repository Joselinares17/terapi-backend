package org.terapi.backend.model.response;

//TODO: Posiblemente cambiar a LoginResponse
public record UserResponse(
        String email,
        String password
) {
}
