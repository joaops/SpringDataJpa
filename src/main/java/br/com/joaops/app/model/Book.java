/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.app.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author João Paulo Siqueira
 * @email joaopaulo1094@gmail.com
 */
@Entity
@Table(name = "BOOK")
public class Book implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOK_ID")
    private Long bookId;
    
    @Column(name = "TITLE")
    private String title;
    
    @Column(name = "PUBLISH_DATE")
    private Date publish_date;
    
    @Column(name = "PAGE_COUNT")
    private Integer page_count;
    
    @Column(name = "PRICE", scale = 2, precision = 5)
    private BigDecimal price;
    
    public Book() {
        this("", new Date(), 0, new BigDecimal(0));
    }
    
    public Book(String title, Date publish_date, Integer page_count, BigDecimal price) {
        this.title = title;
        this.publish_date = publish_date;
        this.page_count = page_count;
        this.price = price;
    }
    
    public Long getBookId() {
        return bookId;
    }
    
    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public Date getPublish_date() {
        return publish_date;
    }
    
    public void setPublish_date(Date publish_date) {
        this.publish_date = publish_date;
    }
    
    public Integer getPage_count() {
        return page_count;
    }
    
    public void setPage_count(Integer page_count) {
        this.page_count = page_count;
    }
    
    public BigDecimal getPrice() {
        return price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.bookId);
        hash = 67 * hash + Objects.hashCode(this.title);
        hash = 67 * hash + Objects.hashCode(this.publish_date);
        hash = 67 * hash + Objects.hashCode(this.page_count);
        hash = 67 * hash + Objects.hashCode(this.price);
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.title, other.title)) {
            return false;
        }
        if (!Objects.equals(this.bookId, other.bookId)) {
            return false;
        }
        if (!Objects.equals(this.publish_date, other.publish_date)) {
            return false;
        }
        if (!Objects.equals(this.page_count, other.page_count)) {
            return false;
        }
        if (!Objects.equals(this.price, other.price)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Book{" + "bookId=" + bookId + ", title=" + title + ", publish_date=" + publish_date + ", page_count=" + page_count + ", price=" + price + '}';
    }
    
}