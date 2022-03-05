package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mariyam = new Student(
                    "Mariryam",
                    LocalDate.of(1998, Month.JANUARY, 4),
                    "marya.jamal@gmail.com"
            );  

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(2000, Month.JANUARY, 4),
                    "alex.jamal@gmail.com"
            );

            repository.saveAll(
                    List.of(mariyam, alex)
            );
        };
    }
}
