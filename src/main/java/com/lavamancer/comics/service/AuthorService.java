package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Author;
import com.lavamancer.comics.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class AuthorService {

    @Autowired AuthorRepository authorRepository;


    @PostConstruct
    public void init() {
        Author author = new Author();
        author.setName("Stan Lee");
        authorRepository.save(author);
        author = new Author();
        author.setName("Joe Quesada");
        authorRepository.save(author);
    }

}
