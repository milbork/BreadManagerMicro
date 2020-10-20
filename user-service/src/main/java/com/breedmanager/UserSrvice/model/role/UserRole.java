package com.breedmanager.UserSrvice.model.role;

import com.breedmanager.UserSrvice.model.user.User;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "role_name")
    private String roleName;

    @OneToMany (mappedBy = "role")
    private List<User> users;

}
