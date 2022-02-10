package com.example.springboot.repository;

import com.example.springboot.data.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Date;
import java.util.List;

public interface UserRepository extends MongoRepository<User,String> {

}
