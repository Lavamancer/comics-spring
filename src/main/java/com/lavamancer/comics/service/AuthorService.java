package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Author;
import com.lavamancer.comics.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AuthorService {

    @Autowired AuthorRepository authorRepository;


    public void init() {
        create("Stan Lee");
        create("Joe Quesada");
    }

    public Author create(String name) {
        Author author = new Author();
        author.setName(name);
        return authorRepository.save(author);
    }

    public Author findById(Long id) {
        return authorRepository.findById(id).get();
    }

    public List<Author> findAll() {
        return authorRepository.findAll();
    }
}
