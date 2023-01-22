package com.tweteroo.tweteroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.DTO.UserDTO;
import com.tweteroo.tweteroo.model.User;
import com.tweteroo.tweteroo.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    public void save(UserDTO req) {
        repository.save(new User(req));
    }

}
