package com.example.sweeBoot.cookie;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CookieConfig {

    @Bean
    CommandLineRunner commandLineRunner(CookieRepository repository) {
        return args -> {
            Cookie biscuit = new Cookie(
                    "Biscuit",
                    List.of("sugar", "milk"),
                    "Stir them all!"
            );

            Cookie biscotti = new Cookie(
                    "Biscotti",
                    List.of("sugar", "milk", "water"),
                    "Stir them all but faster!"
            );

            repository.saveAll(
                    List.of(biscuit, biscotti)
            );
        };
    }
}
