package org.terapi.backend.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.terapi.backend.entity.User;

import java.util.Optional;

@ApplicationScoped
public class UserRepository implements PanacheRepositoryBase<User, Long> {
    public boolean existsByEmail(String email) {
        return count("email", email) > 0;
    }

    public Optional<User> findUserByEmail(String email) {
        return find("email", email).firstResultOptional();
    }
}
