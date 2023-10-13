package com.mybookfinder.enterprise.service;

import com.mybookfinder.enterprise.dao.IBookDAO;
import com.mybookfinder.enterprise.dto.Book;
import org.springframework.stereotype.Component;
@Component
public class BookServiceStub implements IBookService {
    private IBookDAO bookDAO;

    public BookServiceStub(){

    }
    public BookServiceStub(IBookDAO bookDAO){

    }
    public Book save(Book book){
        return bookDAO.save(book);


    }
}
