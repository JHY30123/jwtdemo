package com.jwt.jwtdemo.service;

import com.jwt.jwtdemo.domain.Role;
import com.jwt.jwtdemo.domain.User;
import com.jwt.jwtdemo.repo.RoleRepo;
import com.jwt.jwtdemo.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Override
    public User saveUser(User user) {
        log.info("Saving new user");
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role");
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        log.info("Adding role to user");
        User user = userRepo.findByUserName(userName);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String userName) {
        log.info("Fetching user by username ");
        return userRepo.findByUserName(userName);
    }

    @Override
    public List<User> getUsers() {
        log.info("Fetching all users");
        return userRepo.findAll();
    }

//    public UserServiceImpl(UserRepo userRepo, RoleRepo roleRepo) {
//        this.userRepo = userRepo;
//        this.roleRepo = roleRepo;
//    }
}
