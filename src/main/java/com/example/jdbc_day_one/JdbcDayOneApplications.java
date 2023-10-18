package com.example.jdbc_day_one;

import com.example.jdbc_day_one.model.Part;
import com.example.jdbc_day_one.repository.PartRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JdbcDayOneApplications {

    public static void main(String[] args) {
        SpringApplication.run(JdbcDayOneApplications.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(PartRepository part) {
        return args -> {
            part.save(new Part("cog", 10));
            part.save(new Part("flywheel", 25));
        };
    }

}
