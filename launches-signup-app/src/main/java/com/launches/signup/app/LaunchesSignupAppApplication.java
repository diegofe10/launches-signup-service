package com.launches.signup.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 03 de out de 2020, 23:02:10
 */
@SpringBootApplication
@ComponentScan({
	"com.launches.signup.app.api",
	"com.launches.signup.infrastructure"
	})
@EntityScan({"com.launches.signup.domain"})
@EnableJpaRepositories({"com.launches.signup.infrastructure"})
public class LaunchesSignupAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaunchesSignupAppApplication.class, args);
	}

}
