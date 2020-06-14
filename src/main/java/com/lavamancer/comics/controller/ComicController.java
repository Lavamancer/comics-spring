package com.lavamancer.comics.controller;

import com.lavamancer.comics.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ComicController {

    @Autowired ComicService comicService;


    @GetMapping("/comics")
    public ModelAndView getComics() {
        return new ModelAndView("comics", "comics", comicService.findAll());
    }

}
