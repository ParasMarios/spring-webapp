package com.mparaske.springwebapp.bootstrap;

import com.mparaske.springwebapp.model.Author;
import com.mparaske.springwebapp.model.Book;
import com.mparaske.springwebapp.model.Publisher;
import com.mparaske.springwebapp.repository.AuthorRepository;
import com.mparaske.springwebapp.repository.BookRepository;
import com.mparaske.springwebapp.repository.PublisherRepository;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Data
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        Author marios = new Author();
        marios.setFirstName("Marios");
        marios.setLastName("Paraskevopoulos");

        Book exampleBook = new Book();
        exampleBook.setTitle("Example Book");
        exampleBook.setIsbn("123456789");

        Publisher publisher = new Publisher();
        publisher.setPublisherName("Marios Publisher");
        publisher.setAddress("123 Main St");
        publisher.setCity("New York");
        publisher.setState("NY");
        publisher.setZip("12345");

        Author mariosSaved = authorRepository.save(marios);
        Book exampleBookSaved = bookRepository.save(exampleBook);
        Publisher publisherSaved = publisherRepository.save(publisher);

        mariosSaved.getBooks().add(exampleBookSaved);
        exampleBookSaved.getAuthors().add(mariosSaved);
        publisherSaved.getBooks().add(exampleBookSaved);

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Number of Authors: " + authorRepository.count());
        System.out.println("Number of Publishers: " + publisherRepository.count());

    }
}

