package com.eda.poc.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public record UserLoggedOutEvent(String username) {
}