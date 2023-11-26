package com.mybookfinder.enterprise;

import com.mybookfinder.enterprise.entity.Book;
import com.mybookfinder.enterprise.service.IBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Books")
public class BookFinderController {
    public IBookService bookService;

    public BookFinderController(IBookService theBookService) {

        bookService = theBookService;
    }

    //Upload Book info
    //private List<Book> Book;


    //Mapping for "/list"
    @GetMapping("/list")
    public String listBooks(Model theModel) {
        //Retrieve Books from the Database
        List<Book> theBooks = bookService.findAll();

        //Add Books to the Spring Model
        theModel.addAttribute("bookies", theBooks);

        return "bookies/list-books";


    }

    @GetMapping("/viewAddForm")
    public String viewAddForm(Model theModel) {

        //Model attribute for the data binding
        Book theBook = new Book();


        theModel.addAttribute("books", theBook);

        return "bookies/book-form";
    }
    @GetMapping("/viewUpdateForm")
    public String viewUpdateForm(@RequestParam("bookId") int theId, Model theModel){

        //Retrieve the Book info from the service layer
        Book theBook = bookService.findById(theId);


        //Pre-populate the form by setting the Book as a model attribute
        theModel.addAttribute("books", theBook);

        //Redirect us to the Books form
        return "bookies/book-form";
    }


    @PostMapping("/save")
    public String saveBook(@ModelAttribute("book") Book theBook){

        //Register the Book
        bookService.save(theBook);

        //Block duplicate submission for accidental refresh
        return "redirect:/Books/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("bookId") int theId){

        //Delete Book
        bookService.deleteById(theId);

        //Return to the Books directory
        return "redirect:/Books/list";

    }


}

