package br.com.daguer.MedLink.repository;

import br.com.daguer.MedLink.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.Optional;


public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    Optional<Appointment> findByData(LocalDateTime data);

}
