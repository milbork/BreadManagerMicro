package com.breedmanager.UserSrvice.repository;

import com.breedmanager.UserSrvice.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}