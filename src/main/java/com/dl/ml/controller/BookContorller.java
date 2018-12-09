package com.dl.ml.controller;

import com.dl.ml.domain.Book;
import com.dl.ml.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookContorller {

    @Autowired
    BookRepository bookRepository;

    @GetMapping(value = "/book")
    public List<Book> getBooks(){
        Book book1 = Book.builder().isbn(100L).author("Harry").title("Success habits").price(18.9).build();
        bookRepository.saveBook();
        return Arrays.asList(new Book[]{book1});
    }
}
