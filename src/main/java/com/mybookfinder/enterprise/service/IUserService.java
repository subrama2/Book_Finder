package com.mybookfinder.enterprise.service;

import com.mybookfinder.enterprise.dto.Person;

public interface IUserService {
    boolean authenticate(String username, String password);
    boolean createUser(Person user);
}
