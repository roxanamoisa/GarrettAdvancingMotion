package com.example.roxanamoisa;

import com.example.roxanamoisa.entity.User;
import com.example.roxanamoisa.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RoxanamoisaApplication {
	private static final Logger log = LoggerFactory.getLogger(RoxanamoisaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RoxanamoisaApplication.class, args);
	}

	@Bean
	public CommandLineRunner initializeUsers(UserRepository repository) {
		return (args) -> {

			repository.save(new User(1L, "John", "Smith", 38));
			repository.save(new User(2L, "Jane", "Doe", 25));
			repository.save(new User(3L, "Ann", "Keller", 30));
			repository.save(new User(4L, "Colin", "Reade", 33));
			repository.save(new User(5L, "Ann", "Smith", 33));
			repository.save(new User(6L, "Ryan", "Smith", 33));


			log.info("USERS IN SYSTEM:\n");
			for (User user : repository.findAll()) {
				log.info(user.toString());
			}
		};
	}
}
