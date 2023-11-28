package com.mybookfinder.enterprise;

import com.mybookfinder.enterprise.dto.Person;
import com.mybookfinder.enterprise.entity.Book;
import com.mybookfinder.enterprise.service.IBookService;
import com.mybookfinder.enterprise.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping("/start")
    public String start(Model theModel) {
        return "bookies/start";


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

    @GetMapping("/search")
    public String searchBooks(@RequestParam("searchQuery") String theSearch, Model theModel){
        List<Book> theBooks = bookService.search(theSearch);
        theModel.addAttribute("bookies",theBooks);
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
    @Autowired
    IUserService userService;
    @GetMapping("/login")
    public String showLoginForm() {
        return "bookies/login";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage() {
        return "bookies/login"; // Return the login view when the root URL is accessed
    }
    @PostMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password, Model model) {
        boolean authenticated = userService.authenticate(username, password);
        if (authenticated) {
            return "/bookies/start";
        } else {
            model.addAttribute("error", "Invalid credentials");
            return "bookies/login";
        }
    }
    @PostMapping("/createAccount")
    public String createAccount(@RequestParam("username") String username,
                                @RequestParam("password") String password,
                                Model model) {
        Person newUser = new Person();
        newUser.setUsername(username);
        newUser.setPassword(password);
        return "bookies/login";

    }


}

