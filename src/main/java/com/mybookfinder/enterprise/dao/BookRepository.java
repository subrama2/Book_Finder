package com.mybookfinder.enterprise.dao;

import com.mybookfinder.enterprise.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

    public List<Book>findAllByOrderByTitleAsc();

}
