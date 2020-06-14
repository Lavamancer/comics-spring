package com.lavamancer.comics.controller;

import com.lavamancer.comics.service.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PublisherController {

    @Autowired PublisherService publisherService;


    @GetMapping("/publishers")
    public ModelAndView getPublishers() {
        return new ModelAndView("publishers", "publishers", publisherService.findAll());
    }
}
