package com.eda.poc.controller;

import com.eda.poc.service.UserSessionManager;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/session")
public class SessionController {
    private final UserSessionManager sessionManager;

    public SessionController(UserSessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @PostMapping("/login")
    public String login(@RequestParam String username) {
        sessionManager.login(username);
        return "CONTROLLER: Login event published for " + username;

    }

    @PostMapping("/logout")
    public String logout(@RequestParam String username) {
        sessionManager.logout(username);
        return "CONTROLLER: Logout event published for " + username;
    }

}
