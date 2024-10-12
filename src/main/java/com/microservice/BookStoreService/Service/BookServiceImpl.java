package com.microservice.BookStoreService.Service;
import com.microservice.BookStoreService.DAO.BookDao;
import com.microservice.BookStoreService.DAO.BookIssueDao;
import com.microservice.BookStoreService.Entity.Book;
import com.microservice.BookStoreService.Entity.BookIssue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;
    private final BookIssueDao bookIssueDao;

    public BookServiceImpl(BookDao bookDao, BookIssueDao bookIssueDao) {
        this.bookDao = bookDao;
        this.bookIssueDao = bookIssueDao;
    }


    @Override
    public List<Book> getAllBooks() {
        log.info("--BookServiceImpl-----getAllBooks()-----");
        return bookDao.findAll();
    }

    @Override
    public Book getBookById(Integer bid) {
        log.info("--BookServiceImpl-----getBookById()-----");
        return bookDao.findById(bid).get();
    }

    @Override
    public void addBook(Book book) {
        log.info("--BookServiceImpl-----addBook()-----");
        bookDao.save(book);
    }

    @Override
    public void updateBook(Book book) {
        log.info("--BookServiceImpl-----updateBook()-----");
        bookDao.saveAndFlush(book);
    }

    @Override
    public void deleteBook(Integer bid) {
        log.info("--BookServiceImpl-----deleteBook()-----");
        bookDao.deleteById(bid);
    }

    @Override
    public BookIssue getBookIssueDetailsById(Integer bookid) {
        log.info("--BookServiceImpl-----getBookissuedetailsById()------");
        return bookIssueDao.findById(bookid).get();
    }

    @Override
    public List<BookIssue> getBookIssueDetails() {
        log.info("--BookServiceImpl-----getBookissuedetails()------");
        return bookIssueDao.findAll();
    }


}



