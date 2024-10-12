package com.microservice.BookStoreService.Controller;

import com.microservice.BookStoreService.Entity.Book;
import com.microservice.BookStoreService.Entity.BookIssue;
import com.microservice.BookStoreService.Service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Slf4j
@Tag(name="BookController" ,description = "To perform operation on BooksStore")
public class BookController {
   private final BookService bookService;

    public BookController(BookService bookService)
    {
        this.bookService=bookService;
    }

    @GetMapping("/books")
    @Operation(summary = "Give All Books",
            description = "getAllBooks ")
    public List<Book> showBooksList() {
        log.info("------BookController--showBooksList()-----------");
    return bookService.getAllBooks();
    }

    @GetMapping("/books/{bid}")
    @Operation(summary = "Give All Books By Id ",
        description = "getBookById")
    public Book viewBook(@PathVariable Integer bid) {
        log.info("------BookController--ViewBook()------");
        return bookService.getBookById(bid);
    }

    @PostMapping("/addbook")
    @Operation(summary = "Add Books",
            description = "addBook")
    public void addBook(@RequestBody Book book){
        log.info("------BookController--AddBook()-------");
      bookService.addBook(book);
    }

    @PutMapping("/updatebook")
    @Operation(summary = "UpdateBook",
            description = "updateBook")
    public void saveUpdateBook(@RequestBody Book book){
        log.info("-----BookController---saveUpdateBook()-------");
        bookService.updateBook(book);
    }

    @DeleteMapping("/deletebook/{bid}")
    @Operation(summary = "DeleteBook By Id",
            description = "deleteBook")
    public void deleteBook(@PathVariable Integer bid){
        log.info("-----BookController--deleteBook()-----");
        bookService.deleteBook(bid);
    }

    @GetMapping("/bookissue/{bookid}")
    @Operation(summary = "Give All bookissue Details",
            description = "getBookIssueDetailsById")
    public BookIssue getBookIssueDetailsById(@PathVariable Integer bookid) {
        log.info("-----BookController--getBookIssueDetailsById()-----");
        return  bookService.getBookIssueDetailsById(bookid);
    }

    @GetMapping("/bookIssueAllRecord")
    @Operation(summary = "Give All bookissue Details",
            description = "getBookIssueDetails")
    public List<BookIssue> getBookIssueDetails() {
        log.info("-----BookController--getBookIssueDetails()-----");
        return  bookService.getBookIssueDetails();
    }
}
