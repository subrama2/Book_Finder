package com.mybookfinder.enterprise.dto;

import lombok.Data;

import java.util.List;

public @Data class Person {
        private String name;
        private String emailAddress;
        private int studentNumber;
        private List<String> reminders;
    }
