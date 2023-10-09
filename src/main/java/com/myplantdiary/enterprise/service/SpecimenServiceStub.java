package com.myplantdiary.enterprise.service;

import com.myplantdiary.enterprise.dao.IBookDAO;
import com.myplantdiary.enterprise.dto.Book;
import com.myplantdiary.enterprise.dto.Person;
import org.springframework.stereotype.Component;

@Component
public class SpecimenServiceStub implements ISpecimenService{
    private IBookDAO bookDAO;

    public SpecimenServiceStub(){

    }
    public SpecimenServiceStub(IBookDAO bookDAO){

    }
    public Book save(Book book){
        return bookDAO.save(book);


    }
}
