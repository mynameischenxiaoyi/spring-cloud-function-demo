package com.yichen.springcloudfunction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Optional;

@RestController
public class HelloController {

    @GetMapping("/hello2")
    public Flux<String> hello2() {
        return Flux.just("Welcome to reactive world ~","haha");
    }

    @GetMapping("/hello1")
    public Mono<String> hello1() {
        String a="null";
        return Mono.justOrEmpty( Optional.of(a));
    }

    @GetMapping("/hello")
    public String hello() {
        return "Welcome to reactive world ~";
    }
}
