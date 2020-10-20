package com.breedmanager.UserSrvice.repository;

import com.breedmanager.UserSrvice.model.role.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<UserRole, Long> {
    UserRole findByRoleName(String name);
}
