/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.app.repository;

import br.com.joaops.app.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 
 * @author João Paulo Siqueira
 * @email joaopaulo1094@gmail.com
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    
}