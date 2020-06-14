package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Genre;
import com.lavamancer.comics.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class GenreService {

    @Autowired GenreRepository genreRepository;


    public void init() {
        create("Ciencia Ficción");
        create("Terror");
        create("Comedia");
    }

    public Genre create(String name) {
        Genre genre = new Genre();
        genre.setName(name);
        return genreRepository.save(genre);
    }

    public Genre findById(Long id) {
        return genreRepository.findById(id).get();
    }

    public List<Genre> findAll() {
        return genreRepository.findAll();
    }
}
