package com.jwt.jwtdemo.repo;

import com.jwt.jwtdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUserName(String userName);
}
