package br.com.daguer.MedLink.repository;

import br.com.daguer.MedLink.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByEmail(String email);

    Optional<User> getOneByEmail(String email);
}
