package com.codingdojo.languages.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.languages.models.Language;
import com.codingdojo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	
	private final LanguageRepository languagesRepository;
	
	public LanguageService(LanguageRepository langRepo) {
		languagesRepository = langRepo;
	}
	
	// returns all the languages
	public List<Language> allLanguages(){
		return languagesRepository.findAll();
	}
	
	// creates a new Language
	public Language createLanguage(Language language) {
		return languagesRepository.save(language);
	}
	
	// update one Language
	
	public Language updateOLanguage(Language language) {
		return languagesRepository.save(language);
	}
	
	// find one Language
	public Language findOLanguage(Long id) {
		return languagesRepository.findById(id).orElse(null);
	}
	
	// delete one Language
	public Language deleteOLanguage(Long id) {
		Language deletedLanguage = languagesRepository.findById(id).orElse(null);
		languagesRepository.deleteById(id);
		return deletedLanguage;
	}
	
//	public void deleteOLanguage(Long id) {
//		languagesRepository.deleteById(id);
//	}
	
}
