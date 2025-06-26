package org.terapi.backend.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.terapi.backend.entity.Patient;
import org.terapi.backend.entity.User;
import org.terapi.backend.model.mapper.UserMapper;
import org.terapi.backend.model.request.LoginUserRequest;
import org.terapi.backend.model.request.RegisterPatientRequest;
import org.terapi.backend.repository.UserRepository;

@ApplicationScoped
public class AuthenticationService {
    private UserRepository userRepository;
    private UserMapper userMapper;

    @Inject
    public AuthenticationService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Transactional
    public boolean register(RegisterPatientRequest request) {
        if (userRepository.existsByEmail(request.email())) {
            throw new RuntimeException("El usuario ya existe.");
        }

        Patient patient = new Patient();
        patient.setName(request.name());
        patient.setEmail(request.email());
        patient.setPassword(request.password());

        userRepository.persist(patient);
        return true;
    }

    @Transactional
    public boolean login(LoginUserRequest request) {
        User userDb = userRepository.findUserByEmail(request.email())
                .orElseThrow(() -> new RuntimeException("El usuario no existe."));

        //TODO: El password debe estar encriptado en DB
        if(!userDb.getPassword().equals(request.password())) {
            throw new RuntimeException("Las contraseñas no coinciden.");
        }

        return true;
    }
}
