package com.example.hello.hello;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {
    @Bean
    CommandLineRunner init(ChapterRepository repository) {
        return args -> {
            Flux.just(
                new Chapter("hello"),
                new Chapter("hello 2"),
                new Chapter("hello 3")
            )
                .flatMap(repository::save)
                .subscribe(System.out::println);
        };
    }
}
