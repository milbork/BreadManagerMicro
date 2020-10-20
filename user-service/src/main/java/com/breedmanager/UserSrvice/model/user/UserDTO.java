package com.breedmanager.UserSrvice.model.user;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserDTO {

    private Long id;
    @NotBlank
    private String userFunction;
    @NotBlank
    @Size(min = 2, max = 30)
    private String firstName;
    @NotBlank
    @Size(min = 2, max = 30)
    private String lastName;
    @NotBlank
    @Size(min = 8, max = 30)
    private String password;
    @Column(nullable = false, unique = true, length = 100)
    private String email;

    public UserDTO() {
    }

    public UserDTO(String userFunction, String firstName, String lastName, String password, String email) {

        this.userFunction = userFunction;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public Long getId() {
        return id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
