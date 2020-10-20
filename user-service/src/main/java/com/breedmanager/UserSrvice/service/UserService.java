package com.breedmanager.UserSrvice.service;

import com.breedmanager.UserSrvice.model.user.User;
import com.breedmanager.UserSrvice.model.user.UserDTO;


public interface UserService {
    UserDTO createUser(UserDTO userDTO);

    void editProfile(UserDTO userDTO);

    void removeUser(Long id);

    User getUserById(Long id);

    boolean checkIfUserAlreadyExist(UserDTO user);

    boolean checkIfEmailIsAlreadyUsed(String currentEmail, UserDTO userDTO);
}
