package br.com.daguer.MedLink.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString(callSuper = true)
public class Secretary extends User {

    public Secretary(String email, String name, String username, String password){
        super(email, name, username, password, User.Role.SECRETARY);
    }

}
