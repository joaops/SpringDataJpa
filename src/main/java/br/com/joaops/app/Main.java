/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.joaops.app;

import br.com.joaops.app.config.DataConfiguration;
import br.com.joaops.app.service.BookService;
import br.com.joaops.app.model.Book;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 
 * @author João Paulo Siqueira
 * @email joaopaulo1094@gmail.com
 */
public class Main {
    
    public static void main(String[] args) {
        try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DataConfiguration.class)) {
            BookService service = context.getBean(BookService.class);
            Book book = new Book("First Book", new Date(), 33, new BigDecimal(26.50));
            service.save(book);
            List<Book> books = service.findAll();
            System.out.println("================================================================================================");
            books.forEach((b) -> {
                System.out.println(b);
            });
            System.out.println("================================================================================================");
        }
    }
    
}