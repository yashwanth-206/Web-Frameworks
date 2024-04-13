package com.example.day4pah.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day4pah.model.Book;
import com.example.day4pah.repository.BookRepo;




@Service
public class BookService {
     @Autowired
     private BookRepo bookRepo;

     public Book SaveEntity(Book entity) {
          return bookRepo.save(entity);
     }

     public List<Book> getDetails() {
          return bookRepo.findAll();
     }

     public Optional<Book> getBookById(int bookId) {
          
          return bookRepo.findById(bookId);
     }

}