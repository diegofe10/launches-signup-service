package com.launches.signup.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic-information")
public class BasicInformationController {
	
	@GetMapping
	public String getInfo() {
		return "it's works!";
	}
}
