package org.java.courses;

import org.java.courses.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses =UserRepository.class)
public class BootwithdockersecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootwithdockersecurityApplication.class, args);
	}

}
