package com.mybookfinder.enterprise.service;


import com.mybookfinder.enterprise.entity.Book;

import java.util.List;

public interface IBookService {
        public List<Book> findAll();
        public List<Book> search(String theSearch);

        public Book findById(int theId);


        public void save(Book theBook);


        public void deleteById(int theId);

}
