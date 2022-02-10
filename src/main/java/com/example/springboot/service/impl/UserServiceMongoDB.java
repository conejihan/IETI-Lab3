package com.example.springboot.service.impl;


import com.example.springboot.data.User;
import com.example.springboot.dto.UserDto;
import com.example.springboot.repository.UserRepository;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class UserServiceMongoDB implements UserService {

    private final UserRepository userRepository;

    public UserServiceMongoDB(@Autowired UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }
    @Override
    public User create(User user) {
        userRepository.save(user);
        return user;
    }

    @Override
    public User findById(String id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public boolean deleteById(String id) {
        userRepository.deleteById(id);
        return true;
    }

    @Override
    public User update(UserDto userDto, String userId) {
        User user = findById(userId);
        user.setName(userDto.getName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        return user;
    }
    
}
