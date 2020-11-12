package com.yichen.springcloudfunction.repository;

import com.yichen.springcloudfunction.domain.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {  // 1
    Mono<User> findByUsername(String username);
    Mono<Long> deleteByUsername(String username);
}
