package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    // Spring Boots runs all CommandLineRunner beans once the app context is loaded
    CommandLineRunner initDatabase
    // Runner requests copy
    (EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Employee("Serena Willaims", "Tennis Player")));

            log.info("Preloading " + repository.save(new Employee("Bob Marley", "Artist")));
        };
    }
}
