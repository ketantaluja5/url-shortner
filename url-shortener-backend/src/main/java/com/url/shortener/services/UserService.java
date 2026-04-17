package com.url.shortener.services;

import com.url.shortener.dtos.LoginRequest;
import com.url.shortener.models.User;
import com.url.shortener.security.jwt.JwtAuthenticationResponse;

public interface UserService {
    User registerUser(User user);

    JwtAuthenticationResponse loginUser(LoginRequest loginRequest);
}
