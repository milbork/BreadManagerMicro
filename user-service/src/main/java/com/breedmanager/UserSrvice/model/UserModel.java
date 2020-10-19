package com.breedmanager.UserSrvice.model;

import org.springframework.hateoas.RepresentationModel;

import javax.persistence.*;

@Entity

public class UserModel extends RepresentationModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userFunction;
    private String firstName;
    private String lastName;
    private String password;
    private int enabled;
    private String email;

    public UserModel() {
    }

    public UserModel(Long id, String userFunction, String firstName, String lastName, String password, int enabled, String email) {
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
