package com.lavamancer.comics.controller;

import com.lavamancer.comics.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GenreController {

    @Autowired GenreService genreService;


    @GetMapping("/genres")
    public ModelAndView getGenres() {
        return new ModelAndView("genres", "genres", genreService.findAll());
    }
}
