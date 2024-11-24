package br.com.daguer.MedLink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Patient extends User
{

    public Patient(String email, String name, String username, String password){
        super(email, name, username, password, Role.PACIENT);
    }

    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private LocalDate data;
}
