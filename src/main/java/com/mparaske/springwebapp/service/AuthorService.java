package com.mparaske.springwebapp.service;

import com.mparaske.springwebapp.model.Author;

public interface AuthorService {

    Iterable<Author> listAllAuthors();
}
