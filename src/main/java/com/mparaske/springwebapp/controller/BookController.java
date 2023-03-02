package com.mparaske.springwebapp.controller;

import com.mparaske.springwebapp.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/book")
    public String getBooks(Model model) {

        model.addAttribute("book", bookService.listAllBooks());

        return "book";
    }
}
