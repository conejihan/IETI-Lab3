package com.example.springboot.service.impl;

import com.example.springboot.data.User;

import com.example.springboot.dto.UserDto;
import com.example.springboot.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class UserServiceHashMap implements UserService {
    private HashMap<String, User> users = new HashMap<String, User>();
    private Integer IdGenerate = 1;
    @Override
    public User create(User user) {
        user.setId(IdGenerate.toString());
        users.put(IdGenerate.toString(),user);
        return user;
    }

    @Override
    public User findById(String id) {
        return users.get(id);
    }

    @Override
    public List<User> getAll() {
        List<User> allUsers = new ArrayList<User>();
        for(String id : users.keySet()){
            allUsers.add(users.get(id));
        }
        return allUsers;
    }

    @Override
    public boolean deleteById(String id) {
        users.remove(id);
        return true;
        
    }

    @Override
    public User update(UserDto userdto, String userId) {
        User user = users.get(userId);
        user.setName(userdto.getName());
        user.setLastName(userdto.getLastName());
        user.setEmail(userdto.getEmail());
        return user;
    }

    @Override
    public List<User> findUsersWithNameOrLastNameLike(String queryText) {
        return null;
    }

    @Override
    public List<User> findUsersCreatedAfter(Date startDate) {
        return null;
    }
}
