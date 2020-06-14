package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Comic;
import com.lavamancer.comics.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class ComicService {

    @Autowired ComicRepository comicRepository;
    @Autowired GenreService genreService;
    @Autowired AuthorService authorService;
    @Autowired PublisherService publisherService;


    public void init() {
        create("Spiderman Volumen 1", 1L, 1L, 1L);
        create("Spiderman Volumen 2", 2L, 1L, 1L);
        create("Comic Test", 3L, 2L, 1L);
    }

    public Comic create(String title, Long genreId, Long authorId, Long publisherId) {
        Comic comic = new Comic();
        comic.setTitle(title);
        comic.setGenre(genreService.findById(genreId));
        comic.setAuthor(authorService.findById(authorId));
        comic.setPublisher(publisherService.findById(publisherId));
        comic = comicRepository.save(comic);
        return comic;
    }

}
