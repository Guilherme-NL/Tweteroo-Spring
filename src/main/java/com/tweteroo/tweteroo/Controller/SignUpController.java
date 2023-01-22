package com.tweteroo.tweteroo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.DTO.UserDTO;
import com.tweteroo.tweteroo.service.UserService;

@RestController
@RequestMapping("/api/auth")
public class SignUpController {

    @Autowired
    private UserService service;

    @PostMapping("/sign-up")
    public void CreateUser(@RequestBody UserDTO req) {
        System.out.println(req);
        service.save(req);
    }
}
