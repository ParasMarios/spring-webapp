package com.mparaske.springwebapp.repository;

import com.mparaske.springwebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}

