package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Publisher;
import com.lavamancer.comics.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PublisherService {

    @Autowired PublisherRepository publisherRepository;


    public void init() {
        create("Marvel");
    }

    public Publisher create(String name) {
        Publisher publisher = new Publisher();
        publisher.setName(name);
        return publisherRepository.save(publisher);
    }


    public Publisher findById(Long id) {
        return publisherRepository.findById(id).get();
    }

    public List<Publisher> findAll() {
        return publisherRepository.findAll();
    }
}
