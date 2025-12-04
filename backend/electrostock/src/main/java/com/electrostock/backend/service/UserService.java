package com.electrostock.backend.service;

import com.electrostock.backend.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findByUsername(String username);
    List<User> getAllUsers();
}