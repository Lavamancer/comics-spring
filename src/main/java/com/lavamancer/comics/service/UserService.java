package com.lavamancer.comics.service;

import com.lavamancer.comics.entity.User;
import com.lavamancer.comics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired UserRepository userRepository;


    @PostConstruct
    public void init() {
        System.out.println("UserService: init method called");
        User user = new User();
        user.setEmail("admin@comics.com");
        user.setPassword("1234");
        userRepository.save(user);

        user = new User();
        user.setEmail("johndoe@comics.com");
        user.setPassword("1234");
        userRepository.save(user);

        user = new User();
        user.setEmail("janedoe@comics.com");
        user.setPassword("1234");
        userRepository.save(user);
    }


}
