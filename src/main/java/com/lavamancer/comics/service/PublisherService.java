package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.Publisher;
import com.lavamancer.comics.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class PublisherService {

    @Autowired PublisherRepository publisherRepository;


    @PostConstruct
    public void init() {
        Publisher publisher = new Publisher();
        publisher.setName("Marvel");
        publisherRepository.save(publisher);
    }


}
