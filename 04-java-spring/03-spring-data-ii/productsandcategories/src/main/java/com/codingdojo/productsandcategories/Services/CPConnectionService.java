package com.codingdojo.productsandcategories.Services;

import org.springframework.stereotype.Service;

import com.codingdojo.productsandcategories.Models.CPConnectionModel;
import com.codingdojo.productsandcategories.Repositories.CPConnectionRepository;

@Service
public class CPConnectionService {
	
	private final CPConnectionRepository cpconnectionRepository;
	
	public CPConnectionService(CPConnectionRepository cpconnectionRepository) {
		this.cpconnectionRepository = cpconnectionRepository;
	}
	
	public CPConnectionModel createCPConnectionModel(CPConnectionModel cpconnectionModel) {
		return this.cpconnectionRepository.save(cpconnectionModel);
	}
}
