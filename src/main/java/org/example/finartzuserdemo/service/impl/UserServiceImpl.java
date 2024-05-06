package org.example.finartzuserdemo.service.impl;

import org.example.finartzuserdemo.model.entitiy.User;
import org.example.finartzuserdemo.repository.UserRepository;
import org.example.finartzuserdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user) {

        return userRepository.save(user);
    }
}




