/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.app.service.impl;

import br.com.joaops.app.model.Book;
import br.com.joaops.app.service.BookService;
import br.com.joaops.app.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author João Paulo Siqueira
 * @email joaopaulo1094@gmail.com
 */
@Service("BookService")
public class BookServiceImpl implements BookService {
    
    @Autowired
    private BookRepository repo;
    
    @Override
    public void save(Book book) {
        this.repo.save(book);
    }
    
    @Override
    public List<Book> findAll() {
        return this.repo.findAll();
    }
    
}