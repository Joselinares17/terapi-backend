package org.terapi.backend.controller;

import jakarta.inject.Inject;
import jakarta.validation.Valid;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.terapi.backend.model.request.LoginUserRequest;
import org.terapi.backend.model.request.RegisterPatientRequest;
import org.terapi.backend.service.AuthenticationService;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @Inject
    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @POST
    @Path("/register")
    public Response register(@Valid RegisterPatientRequest request) {
        try {
            authenticationService.register(request);
            return Response.status(Response.Status.CREATED)
                    .entity("Usuario registrado correctamente.").build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity(e.getMessage()).build();
        }
    }

    @POST
    @Path("/login")
    public Response login(@Valid LoginUserRequest request) {
        try {
            authenticationService.login(request);
            return Response.ok("Login exitoso.").build();
        } catch (RuntimeException e) {
            return Response.status(Response.Status.UNAUTHORIZED)
                    .entity(e.getMessage()).build();
        }
    }
}
