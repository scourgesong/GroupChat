package com.example.groupchat.service;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
//@EnableTransactionManagement
public class UserService implements IUserService
{
    @Override
    public String encodePassword(String password) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(10); // Strength set as 16
        String encodedPassword = encoder.encode(password);

        return encodedPassword;
    }
}
