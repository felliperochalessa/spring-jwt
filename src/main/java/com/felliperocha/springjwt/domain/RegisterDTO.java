package com.felliperocha.springjwt.domain;

public record RegisterDTO(String login, String password, UserRole role) {
}
