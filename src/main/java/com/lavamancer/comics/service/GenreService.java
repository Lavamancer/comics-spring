package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Genre;
import com.lavamancer.comics.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class GenreService {

    @Autowired GenreRepository genreRepository;


    @PostConstruct
    public void init() {
        Genre genre = new Genre();
        genre.setName("Terror");
        genreRepository.save(genre);
    }

}
