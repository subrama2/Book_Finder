package com.mybookfinder.enterprise.service;

public interface IUserService {
    boolean authenticate(String username, String password);
}
