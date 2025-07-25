package com.jwt.jwtdemo.controller;

import com.jwt.jwtdemo.domain.User;
import com.jwt.jwtdemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;


    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        return ResponseEntity.ok().body(users);
    }
}
