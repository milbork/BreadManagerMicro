package com.breedmanager.UserSrvice.model;

public class UserDTO {

    private Long id;
    private String userFunction;
    private String firstName;
    private String lastName;
    private String password;
    private int enabled;
    private String email;

    public UserDTO(String userFunction, String firstName, String lastName, String password, int enabled, String email) {

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
