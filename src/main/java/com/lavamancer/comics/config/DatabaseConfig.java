package com.lavamancer.comics.config;

import com.lavamancer.comics.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DatabaseConfig {

    @Autowired UserService userService;
    @Autowired ComicService comicService;
    @Autowired GenreService genreService;
    @Autowired PublisherService publisherService;
    @Autowired AuthorService authorService;


    @PostConstruct
    public void init() {
        userService.init();

        authorService.init();
        publisherService.init();
        genreService.init();
        comicService.init();
    }

}
