package com.launches.signup.infrastructure.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.launches.signup.domain.entity.BasicInformation;
import com.launches.signup.infrastructure.repository.BasicInformationRepository;

@Service
public class BasicInformationService {
		
	private BasicInformationRepository basicInformationRepository;
	
	@Autowired
	public BasicInformationService(BasicInformationRepository basicInformationRepository) {
		this.basicInformationRepository = basicInformationRepository;
	}
	
	@Transactional
	public void save(BasicInformation basicInformation) throws ParseException {
		Date date = new SimpleDateFormat("MM/dd/yyyy").parse(basicInformation.getMonth() + 
				"/" + basicInformation.getDay() + "/" + basicInformation.getYear());
		basicInformation.setBirthDay(date);
		System.out.println(date);
		this.basicInformationRepository.save(basicInformation);
	}
	
}
