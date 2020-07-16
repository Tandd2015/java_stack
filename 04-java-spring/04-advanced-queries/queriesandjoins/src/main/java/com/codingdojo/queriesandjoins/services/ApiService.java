package com.codingdojo.queriesandjoins.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.queriesandjoins.models.CityModel;
import com.codingdojo.queriesandjoins.models.CountryModel;
import com.codingdojo.queriesandjoins.models.LanguageModel;
import com.codingdojo.queriesandjoins.repositories.CityRepository;
import com.codingdojo.queriesandjoins.repositories.CountryRepository;
import com.codingdojo.queriesandjoins.repositories.LanguageRepository;

@Service
public class ApiService {
	@Autowired
	private CountryRepository countryRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public ApiService(CountryRepository countryRepository, CityRepository cityRepository, LanguageRepository languageRepository) {
		this.countryRepository = countryRepository;
		this.cityRepository = cityRepository;
		this.languageRepository = languageRepository;
	}
	
	public List<CountryModel> getAllCountries() {
		return this.countryRepository.findAll();
	}
	
	public List<CountryModel> getHDensityCountries() {
		return this.countryRepository.findHDensityCountries();
	}
	
	public List<CountryModel> getAllConstMonarcCountries() {
		return this.countryRepository.findConstMonarcCountries();
	}
	
	public List<CountryModel> getCountryByName(String name) {
		return this.countryRepository.findCountryByName(name);
	}

	public List<CityModel> getAllCities() {
		return this.cityRepository.findAll();
	}
	
	public List<CityModel> getParamMexicanCities() {
		return this.cityRepository.mexicoCities();
	}
	
	public List<LanguageModel> getAllLanguages() {
		return this.languageRepository.findAll();
	}
	
	public List<Object[]> getCountryByTopLanguage(String topLang) {
		return this.countryRepository.findCountryByLangTop(topLang);
	}
	
	public List<Object[]> getCountryByRegion() {
		return this.countryRepository.findCountryByRegion();
	}
	
	public List<Object[]> getCountriesByCitiesCounted() {
		return this.countryRepository.findCountryCitiesCount();
	}
	
	public List<Object[]> getCountryByParamLanguage() {
		return this.languageRepository.findParamCountryLangs();
	}
	
	public List<Object[]> getParamBuenosAiresCities() {
		return this.cityRepository.argentinaBuenosAiresCities();
	}
}
