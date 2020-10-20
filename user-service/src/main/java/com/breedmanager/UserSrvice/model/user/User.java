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
    private boolean active;
    private String email;


    @ManyToOne
    @JoinColumn (name = "role_id")
    private UserRole role;

    public User() {
    }

    public User(Long id, String userFunction, String firstName, String lastName, String password, boolean active, String email) {
        this.id = id;
        this.userFunction = userFunction;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.active = active;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserFunction() {
        return userFunction;
    }

    public void setUserFunction(String userFunction) {
        this.userFunction = userFunction;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }
}
