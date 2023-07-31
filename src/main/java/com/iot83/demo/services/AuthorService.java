package com.iot83.demo.services;

import com.iot83.demo.models.Author;
import com.iot83.demo.repos.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthor() {
        return authorRepository.findAll();
    }

    public List<Author> getAuthorById(Long id) {
        return authorRepository.findById(id)
                .map(List::of)
                .orElse(List.of());
    }
}
