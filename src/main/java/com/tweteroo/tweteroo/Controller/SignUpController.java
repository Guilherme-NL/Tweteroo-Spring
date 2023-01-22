package com.tweteroo.tweteroo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.DTO.UserDTO;
import com.tweteroo.tweteroo.model.User;
import com.tweteroo.tweteroo.repository.UserRepository;

@RestController
@RequestMapping("/api/auth")
public class SignUpController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/sign-up")
    public List<User> listAll() {
        return repository.findAll();
    }

    @PostMapping("/sign-up")
    public void CreateUser(@RequestBody UserDTO req) {
        System.out.println(req);
        repository.save(new User(req));
    }
}
