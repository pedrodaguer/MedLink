package br.com.daguer.MedLink;


import br.com.daguer.MedLink.model.Appointment;
import br.com.daguer.MedLink.model.Doctor;
import br.com.daguer.MedLink.model.Patient;
import br.com.daguer.MedLink.model.User;
import br.com.daguer.MedLink.repository.AppointmentRepository;
import br.com.daguer.MedLink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


import java.time.LocalDateTime;
import java.util.Optional;


@Component
public class StartApp implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public void run(String... args) throws Exception {


        Optional<User> paciente = userRepository.findByEmail("pepedavila1308@gmail.com");
        Optional<User> doctor = userRepository.findByEmail("doutor2@gmail.com");

        ((Doctor) doctor.orElse(null)).setSpecialty("Cardiologista");
        doctor.orElse(null).setRole(User.Role.DOCTOR);
        userRepository.save(doctor.orElse(null));

    }
}
