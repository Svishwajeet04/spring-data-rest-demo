package com.iot83.demo.controller;

import com.iot83.demo.models.Book;
import com.iot83.demo.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @QueryMapping
    public List<Book> getAllBook(@Argument Long id) {
        return id == null
                ? bookRepository.findAll()
                : bookRepository.findById(id)
                .map(List::of)
                .orElse(List.of());

    }
}
