package com.mparaske.springwebapp.service;

import com.mparaske.springwebapp.model.Author;
import com.mparaske.springwebapp.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> listAllAuthors() {
        return authorRepository.findAll();
    }
}
