package com.example.springboot.service;

import com.example.springboot.data.User;
import com.example.springboot.dto.UserDto;

import java.util.Date;
import java.util.List;

public interface UserService {

    User create(User user );

    User findById( String id );

    List<User> getAll();

    boolean deleteById( String id );

    User update(UserDto userDto, String userId );

    User findByEmail(String email);
}
