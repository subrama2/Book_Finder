package com.mybookfinder.enterprise.dto;

import lombok.Data;

public @Data class Book {
    private String title;
    private String author;
    private String genre;
    private String Description;
    private String isbn;
    private boolean isInterested;

}
