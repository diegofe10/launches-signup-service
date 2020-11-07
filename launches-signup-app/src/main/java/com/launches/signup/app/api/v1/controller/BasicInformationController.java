package com.launches.signup.app.api.v1.controller;

import java.text.ParseException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.launches.signup.domain.entity.BasicInformation;
import com.launches.signup.infrastructure.service.BasicInformationService;

/**
 * @author <a href="mailto:diegogeandafe@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 04 de out de 2020, 00:10:10
 */
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/basic-information")
public class BasicInformationController {
		
	private BasicInformationService basicInformationService;
	
	private final Logger logger = LoggerFactory.getLogger(BasicInformationController.class);
	
	@Autowired
	public BasicInformationController(BasicInformationService basicInformationService) {
		this.basicInformationService = basicInformationService;
	}

	@PostMapping("/create")
	public void create(@Valid @RequestBody BasicInformation basicInformation, 
			HttpServletResponse response) throws ParseException {
		logger.info("Invoke save() method, for create a new basic information.");
		basicInformationService.save(basicInformation);
	}
	
}
