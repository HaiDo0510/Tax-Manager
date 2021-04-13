package org.o7planning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class ThueApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThueApplication.class, args);
	}

}
