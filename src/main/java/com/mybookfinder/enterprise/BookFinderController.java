package com.mybookfinder.enterprise;

import com.mybookfinder.enterprise.dto.Book;
import com.mybookfinder.enterprise.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookFinderController {
    @Autowired
    IBookService bookService;


    /**
     * Handles the root (/) endpoint and return a start page
     * @return
     */


    @RequestMapping("/")
    public String Index(Model model)
    {

        Book book = new Book();
        book.setPubDate("10/10/2010");
        book.setAuthor("mr.seuss");
        book.setDescription("test2");
        book.setGenre("comedy");
        book.setIsbn("1243522");
        book.setInterested(true);
        book.setTitle("Fake Title");
        model.addAttribute(book);
        return "start";
    }

    @RequestMapping("/saveBook")
    public String saveBook(Book book)
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
    public ResponseEntity fetchAllBooks()
    {

        return new ResponseEntity(HttpStatus.OK);
    }
    /**
     * Endpoint to fetch book by Title
     */
    @GetMapping("/book/{title}/")
    public ResponseEntity fetchBookById(@PathVariable("title") String title)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to fetch book by Author
     */
    @GetMapping("/book/{author}/")
    public ResponseEntity fetchBookByAuthor(@PathVariable("author") String author)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to fetch book by Genre
     */
    @GetMapping("/book/{genre}/")
    public ResponseEntity fetchBookByGenre(@PathVariable("genre") String genre)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to fetch book by ISBN
     */
    @GetMapping("/book/{isbn}/")
    public ResponseEntity fetchBookByISBN(@PathVariable("isbn") String isbn)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to find book via publish date
     *
     */
    @GetMapping("/book/{pubDate}/")
    public ResponseEntity fetchBookByPubDate(@PathVariable("pubDate") String pubDate)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

    /**
     * Endpoint to fetch list of books marked as "interested" by user
     */
    // @GetMapping("/book/{isbn}/")
    //public ResponseEntity fetchBookByInterest(@PathVariable("interest") String interest)
    //{
     //   return new ResponseEntity(HttpStatus.OK);
  //  }

    /**
     * Endpoint to create book
     */
@PostMapping(value = "/book", consumes = "application/json", produces = "application/json")
    public Book createBook(@RequestBody Book book)
    {
        return book;
    }

    /**
     * Endpoint to delete book by ID
     */
@DeleteMapping("/book/{title}")
    public ResponseEntity deleteBook(@PathVariable("title") String title)
    {
        return new ResponseEntity(HttpStatus.OK);
    }

}
