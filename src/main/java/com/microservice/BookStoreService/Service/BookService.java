package com.microservice.BookStoreService.Service;

import com.microservice.BookStoreService.Entity.Book;
import com.microservice.BookStoreService.Entity.BookIssue;

import java.util.List;

public interface BookService {
    public List<Book> getAllBooks();
    public Book getBookById(Integer bid);
    public void  addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer bid);
    public BookIssue getBookIssueDetailsById(Integer bookid);
    public List<BookIssue> getBookIssueDetails();
}