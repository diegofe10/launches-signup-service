package com.launches.signup.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
	"com.launches.signup.app.api",
	"com.launches.signup.infrastructure"
	})
public class LaunchesSignupAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaunchesSignupAppApplication.class, args);
	}

}
