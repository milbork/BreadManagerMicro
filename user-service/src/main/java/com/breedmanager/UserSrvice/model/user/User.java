package com.breedmanager.UserSrvice.model.user;

import com.breedmanager.UserSrvice.model.role.UserRole;
import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User extends RepresentationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userFunction;
    private String firstName;
    private String lastName;
    private String password;
    private int enabled;
    private String email;


    @ManyToOne
    @JoinColumn (name = "role_id")
    private UserRole role;

    public User() {
    }

    public User(Long id, String userFunction, String firstName, String lastName, String password, int enabled, String email) {
        this.id = id;
        this.userFunction = userFunction;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.enabled = enabled;
        this.email = email;
    }

    public Long getId() {
        return id;
    }
}
