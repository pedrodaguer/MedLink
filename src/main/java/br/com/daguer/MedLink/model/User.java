package br.com.daguer.MedLink.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tab_users")
public abstract class User {

    @Id
    @Column(unique = true, nullable = false)
    private String email;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String username;

    @Column(length = 100, nullable = false)
    private String password;

    @Column(length = 100, nullable = false)
    @Enumerated(EnumType.STRING)
    private Role role;

    public enum Role {
        SECRETARY, PACIENT, DOCTOR
    }

}
