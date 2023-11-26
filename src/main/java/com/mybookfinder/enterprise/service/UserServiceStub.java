package com.mybookfinder.enterprise.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceStub implements IUserService {

    @Override
    public boolean authenticate(String username, String password) {
        return "admin".equals(username) && "password".equals(password);
    }
}
