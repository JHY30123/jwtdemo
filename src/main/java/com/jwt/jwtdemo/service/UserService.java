package com.jwt.jwtdemo.service;

import com.jwt.jwtdemo.domain.Role;
import com.jwt.jwtdemo.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String userName, String roleName);

    User getUser(String userName);

    List<User> getUsers();
}
