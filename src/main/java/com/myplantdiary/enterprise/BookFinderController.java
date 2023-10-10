package com.mybookfinder.enterprise;

import com.mybookfinder.enterprise.dto.Person;
import com.mybookfinder.enterprise.service.ISpecimenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookFinderController {
    /**
     * Handles the root (/) endpoint and return a start page
     * @return
     */
    @Autowired
    IBookService bookService;
    @RequestMapping("/")
    public String Index(Model model)
    {
        Person book = new Person();
        model.addAttribute(book);
        return "start";
    }

    @RequestMapping("/saveBook")
    public String saveBook(Person book)
    {
        try
        {
            bookService.save(book);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return "start";
        }
        return "start";
    }
    /**
     * Endpoint to fetch specimens
     */
    @GetMapping("/book")
    public ResponseEntity fetchAllSpecimens()
    {
        return new ResponseEntity(HttpStatus.OK);
    }
    /**
     * Endpoint to fetch book by ID
     */
    @GetMapping("/book/{id}/")
    public ResponseEntity fetchSpecimenById(@PathVariable("id") String id)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to create book
     */
@PostMapping(value = "/book", consumes = "application/json", produces = "application/json")
    public Person createSpecimen(@RequestBody Person book)
    {
        return book;
    }

    /**
     * Endpoint to delete book by ID
     */
@DeleteMapping("/book/{id}")
    public ResponseEntity deleteSpecimen(@PathVariable("id") String id)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

}
