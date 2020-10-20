package com.breedmanager.UserSrvice.service;

import com.breedmanager.UserSrvice.model.role.UserRole;
import com.breedmanager.UserSrvice.model.user.User;
import com.breedmanager.UserSrvice.model.user.UserDTO;
import com.breedmanager.UserSrvice.repository.RoleRepository;
import com.breedmanager.UserSrvice.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, ModelMapper modelMapper, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {

        User user = modelMapper.map(userDTO, User.class);
        UserRole userRole = roleRepository.findByRoleName("ROLE_USER");
        user.setRole(userRole);
        user.setActive(true);
        userRepository.save(user);
        return modelMapper.map(user, UserDTO.class);
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
