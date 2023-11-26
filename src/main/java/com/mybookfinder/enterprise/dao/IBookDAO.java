package com.mybookfinder.enterprise.dao;

import com.mybookfinder.enterprise.dto.Book;

public interface IBookDAO {
    Book save(Book book) throws Exception;
}
