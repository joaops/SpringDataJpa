/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.app.service;

import br.com.joaops.app.model.Book;
import java.util.List;

/**
 * 
 * @author João Paulo Siqueira
 * @email joaopaulo1094@gmail.com
 */
public interface BookService {
    
    public void save(Book book);
    
    public List<Book> findAll();
    
}
