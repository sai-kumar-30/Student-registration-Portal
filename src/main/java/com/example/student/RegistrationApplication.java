package com.example.student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public interface RegistrationApplication {
    public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
	}

}