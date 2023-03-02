package com.mparaske.springwebapp.service;

import com.mparaske.springwebapp.model.Book;

public interface BookService {

    Iterable<Book> listAllBooks();
}
