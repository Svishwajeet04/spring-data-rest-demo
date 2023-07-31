package com.iot83.demo.controller;

import com.iot83.demo.models.Author;
import com.iot83.demo.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @QueryMapping
    public List<Author> getAllAuthor(@Argument Long id) {
        return id == null ?
                authorService.getAllAuthor()
                : authorService.getAuthorById(id);
    }

}
