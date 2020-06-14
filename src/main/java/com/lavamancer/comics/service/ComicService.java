package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Comic;
import com.lavamancer.comics.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class ComicService {

    @Autowired ComicRepository comicRepository;


    @PostConstruct
    public void init() {
        Comic comic = new Comic();
        comic.setTitle("Spiderman Volumen 1");
        comicRepository.save(comic);
    }

}
