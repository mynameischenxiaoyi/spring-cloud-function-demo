package com.yichen.springcloudfunction.service;

import com.yichen.springcloudfunction.domain.User;
import com.yichen.springcloudfunction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    public Mono<Long> deleteByUsername(String username) {
        return userRepository.deleteByUsername(username);
    }

    public Mono<User> findByUsername(String username) {
        return  userRepository.findByUsername(username);
    }

    public Flux<User> findAll() {
        return  userRepository.findAll();
    }
}
