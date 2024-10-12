package com.microservice.BookStoreService.DAO;

import com.microservice.BookStoreService.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
