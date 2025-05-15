package com.eda.poc.service;

import com.eda.poc.model.UserLoggedInEvent;
import com.eda.poc.model.UserLoggedOutEvent;
import org.springframework.context.ApplicationEventPublisher;

import org.springframework.stereotype.Component;


@Component
public class UserSessionManager {
    private final ApplicationEventPublisher publisher;


    public UserSessionManager(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void login(String username) {
        System.out.println("SESSION MANAGER " + username + " logged in.");
        publisher.publishEvent(new UserLoggedInEvent(username));
    }

    public void logout(String username) {
        System.out.println("SESSION MANAGER " + username + " logged out.");
        publisher.publishEvent(new UserLoggedOutEvent(username));
    }

}
