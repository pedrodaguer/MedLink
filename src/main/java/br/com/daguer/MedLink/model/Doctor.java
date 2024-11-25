package br.com.daguer.MedLink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Doctor extends User {

    public Doctor(String email, String name, String username, String password){
        super(email, name, username, password, Role.PACIENT);
    }

    @Column
    private String Crm;
    @Column
    private String Specialty;

}
