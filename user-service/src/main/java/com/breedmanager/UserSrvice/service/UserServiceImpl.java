package com.breedmanager.UserSrvice.service;

import com.breedmanager.UserSrvice.model.user.User;
import com.breedmanager.UserSrvice.model.user.UserDTO;
import com.breedmanager.UserSrvice.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {

        return userDTO;
    }

    @Override
    public void editProfile(UserDTO userDTO) {

    }

    @Override
    public void removeUser(Long id) {

    }

    @Override
    public User getUserById(Long id) {
        return null;
    }

    @Override
    public boolean checkIfUserAlreadyExist(UserDTO user) {
        return false;
    }

    @Override
    public boolean checkIfEmailIsAlreadyUsed(String currentEmail, UserDTO userDTO) {
        return false;
    }
}
