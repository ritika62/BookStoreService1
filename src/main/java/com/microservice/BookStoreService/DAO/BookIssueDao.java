package com.microservice.BookStoreService.DAO;

import com.microservice.BookStoreService.Entity.BookIssue;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookIssueDao extends JpaRepository<BookIssue,Integer>{
}
