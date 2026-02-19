package com.myprojects.ecommerce.controller;

import com.myprojects.ecommerce.model.User;
import com.myprojects.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/uploadUser")
    public String uploadUser(@RequestBody User user) {
        return userService.uploadUser(user);
    }
}
