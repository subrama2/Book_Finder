package com.mybookfinder.enterprise.dto;

import lombok.Data;

public @Data class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private String Description;
    private String isbn;
    private boolean isInterested;

}
