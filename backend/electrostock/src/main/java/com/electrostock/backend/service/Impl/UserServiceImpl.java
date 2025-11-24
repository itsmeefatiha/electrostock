package com.electrostock.backend.service.Impl;


import com.electrostock.backend.entity.User;
import com.electrostock.backend.repository.UserRepository;
import com.electrostock.backend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user){
        return userRepository.save(user);

    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();

    }
}
