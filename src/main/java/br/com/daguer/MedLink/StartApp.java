package br.com.daguer.MedLink;

import br.com.daguer.MedLink.model.Patient;
import br.com.daguer.MedLink.model.User;
import br.com.daguer.MedLink.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class StartApp implements CommandLineRunner {


    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {



    }
}
