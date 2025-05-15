package com.eda.poc.service;

import com.eda.poc.model.UserLoggedInEvent;
import com.eda.poc.model.UserLoggedOutEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoggerService {
    private final List<String> logMessages = new ArrayList<>();

    @EventListener
    public void handleUserLoggedIn(UserLoggedInEvent event) {
        logMessages.add("EVENT: User logged in - " + event.username());
        System.out.println("HANDLED: User logged out - " + event.username());

    }

    @EventListener
    public void handleUserLoggedOut(UserLoggedOutEvent event) {
        logMessages.add("EVENT: User logged out - " + event.username());
        System.out.println("HANDLED: User logged out - " + event.username());
    }

    public List<String> getLogMessages() {
        return logMessages;
    }
}
