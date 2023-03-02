package com.mparaske.springwebapp.controller;

import com.mparaske.springwebapp.service.AuthorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @RequestMapping("/author")
    public String getAuthors(Model model) {

        model.addAttribute("author", authorService.listAllAuthors());

        return "author";
    }
}
