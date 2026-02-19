package com.myprojects.ecommerce.service;

import com.myprojects.ecommerce.model.User;
import com.myprojects.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String uploadUser(User user) {
        userRepository.save(user);
        return "Successfully uploaded User";
    }
}
