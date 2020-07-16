package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.NinjaModel;
import com.codingdojo.dojosandninjas.repositories.NinjaRepository;

@Service
public class NinjaService {
	
	private NinjaRepository ninjaRepository;
	
	public NinjaService(NinjaRepository ninjaRepository) {
		this.ninjaRepository = ninjaRepository;
	}
	
	public NinjaModel CreateNinjaModel(NinjaModel ninjaModel) {
		return this.ninjaRepository.save(ninjaModel);
	}
	
	public List<NinjaModel> findAllNinjaModels() {
		return this.ninjaRepository.findAll();
	}
	
}
