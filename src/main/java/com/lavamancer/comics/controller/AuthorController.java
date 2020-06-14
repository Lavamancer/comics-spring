package com.lavamancer.comics.controller;

import com.lavamancer.comics.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthorController {

    @Autowired AuthorService authorService;


    @GetMapping("/authors")
    public ModelAndView getAuthors() {
        return new ModelAndView("authors", "authors", authorService.findAll());
    }
}
