package com.mybookfinder.enterprise.service;


import com.mybookfinder.enterprise.entity.Book;

import java.util.List;

public interface IBookService {
        public List<Book> findAll();


        public Book findById(int theId);


        public void save(Book theBook);


        public void deleteById(int theId);

}
