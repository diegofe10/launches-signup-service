package com.launches.signup.infrastructure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.launches.signup.domain.entity.Launche;
import com.launches.signup.infrastructure.repository.LauncheRepository;

/**
 * @author <a href="mailto:dafediegogean@gmail.com">Diego Gean da Fé</a>
 * @version
 * @since 07 de nov de 2020, 12:58:10
 */
@Service
public class LauncheService {
	
	private LauncheRepository launcheRepository;
	
	@Autowired
	public LauncheService(LauncheRepository launcheRepository) {
		this.launcheRepository = launcheRepository;
	}

	public List<Launche> getAll() {
		return launcheRepository.findAll();
	}
	
	public void save(Launche launche) {
		launcheRepository.save(launche);
	}
	
}
