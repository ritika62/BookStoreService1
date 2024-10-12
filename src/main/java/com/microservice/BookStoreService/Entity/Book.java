package com.microservice.BookStoreService.Entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name="mybooks")
public class Book {
    @Id
    @Column(name="bid")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer bid;

@Column(name="bname")
private String bname;

@Column(name="author")
private String author;

    @Column(name="price")
    private BigDecimal price;

    @Column(name="category")
    private String category;

    @Column(name="pub")
    private String pub;

public Book(){}

    public Book( String bname, String author, BigDecimal price, String category, String pub) {
        this.bname = bname;
        this.author = author;
        this.price = price;
        this.category = category;
        this.pub = pub;
    }

    public Book(Integer bid, String bname, String author, BigDecimal price, String category, String pub) {
        this.bid = bid;
        this.bname = bname;
        this.author = author;
        this.price = price;
        this.category = category;
        this.pub = pub;
    }

    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bid=" + bid +
                ", bname='" + bname + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", pub='" + pub + '\'' +
                '}';
    }
}

