package com.codingdojo.dojosandninjas.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.dojosandninjas.models.DojoModel;
import com.codingdojo.dojosandninjas.repositories.DojoRepository;

@Service
public class DojoService {

		private DojoRepository dojoRepository;
		
		public DojoService(DojoRepository dojoRepository) {
			this.dojoRepository = dojoRepository;
		}
		
		public DojoModel createDojoModel(DojoModel dojoModel) {
			return this.dojoRepository.save(dojoModel);
		}
		
		public DojoModel findOneDojoModel(Long id) {			
			return this.dojoRepository.findById(id).orElse(null);
		}
		
		public List<DojoModel> findAllDojoModels() {
			return this.dojoRepository.findAll();
		}
}
