package com.mybookfinder.enterprise.service;

import com.mybookfinder.enterprise.dao.BookRepository;
import com.mybookfinder.enterprise.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IBookServiceImpl implements IBookService {
    private BookRepository bookRepository;

    @Autowired
    public IBookServiceImpl (BookRepository theBookRepository){
        bookRepository = theBookRepository;

    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAllByOrderByBookName();
    }

    @Override
    public Book findById(int theId) {
        return bookRepository.findById(theId).get();
    }

    @Override
    public void save(Book theBook) {
        bookRepository.save(theBook);
    }

    @Override
    public void deleteById(int theId) {
        bookRepository.deleteById(theId);

    }
}

