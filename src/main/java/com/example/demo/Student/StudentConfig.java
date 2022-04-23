package com.example.demo.Student;

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
            Student mariam =  new Student(
                    "test1",
                    "test@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 2)
            );
            Student mariam2 =  new Student(
                    "test1",
                    "test@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 2)
            );
        repository.saveAll(List.of(mariam, mariam2));
        };
    }
}
