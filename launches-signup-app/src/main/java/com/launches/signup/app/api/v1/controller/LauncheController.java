package com.launches.signup.app.api.v1.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.launches.signup.domain.entity.Launche;
import com.launches.signup.infrastructure.service.LauncheService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/launche")
public class LauncheController {
	
	private LauncheService launcheService;
	
	private final Logger logger = LoggerFactory.getLogger(LauncheService.class);

	@Autowired
	public LauncheController(LauncheService launcheService) {
		this.launcheService = launcheService;
	}
	
	@GetMapping
	public ResponseEntity<List<Launche>> getAll() {
		logger.info("Invoke getAll() method...");
		return ResponseEntity.ok(launcheService.getAll());
	}
	
	@PostMapping("/create")
	public void create(@Valid @RequestBody Launche launche, HttpServletResponse response) {
		logger.info("Invoke create() method...");
		launcheService.save(launche);
	}
	
}
