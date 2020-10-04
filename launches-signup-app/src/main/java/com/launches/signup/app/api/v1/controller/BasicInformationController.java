package com.launches.signup.app.api.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.launches.signup.infrastructure.service.BasicInformationService;

@RestController
@RequestMapping("/basic-information")
public class BasicInformationController {
	
	private BasicInformationService basicInformationService;
	
	@Autowired
	public BasicInformationController(BasicInformationService basicInformationService) {
		this.basicInformationService = basicInformationService;
	}

	@GetMapping
	public String getBasicInformation() {
		return basicInformationService.getBasicInformation();
	}
	
}
