package com.jwt.jwtdemo.repo;

import com.jwt.jwtdemo.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
