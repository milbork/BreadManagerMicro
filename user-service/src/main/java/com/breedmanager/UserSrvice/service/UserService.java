package com.breedmanager.UserSrvice.service;

import com.breedmanager.UserSrvice.model.UserModel;
import com.breedmanager.UserSrvice.model.UserDTO;


public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    void editProfile(UserDTO userDTO);

    void removeUser(Long id);

    UserModel getUserById(Long id);

    boolean checkIfUserAlreadyExist(UserDTO user);

    boolean checkIfEmailIsAlreadyUsed(String currentEmail, UserDTO userDTO);
}
