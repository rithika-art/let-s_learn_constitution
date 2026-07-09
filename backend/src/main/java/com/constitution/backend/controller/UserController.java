package com.constitution.backend.controller;

import com.constitution.backend.entity.User;
import com.constitution.backend.repository.UserRepository;
import com.constitution.backend.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserRepository userRepository;
    private final JwtUtil jwtUtil;

    public UserController(UserRepository userRepository, JwtUtil jwtUtil) {
        this.userRepository = userRepository;
        this.jwtUtil = jwtUtil;
    }

    @GetMapping("/me")
    public User getCurrentUser(@RequestHeader(value = "Authorization", required = false) String authHeader,
                               @RequestParam(value = "email", required = false) String emailParam) {
        String email;
        if (authHeader != null && authHeader.startsWith("Bearer ")) {
            String token = authHeader.substring(7);
            email = jwtUtil.extractEmail(token);
        } else if (emailParam != null) {
            email = emailParam;
        } else {
            throw new RuntimeException("Email or Authorization header required");
        }
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
        user.setPassword(null);
        return user;
    }
}
