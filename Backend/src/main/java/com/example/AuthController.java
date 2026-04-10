package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping("/register")
    public String register(@RequestBody User user) {
        return "User registered: " + user.getUsername();
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {
        return "User login: " + user.getUsername();
    }
}