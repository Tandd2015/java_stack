package com.codingdojo.queriesandjoins.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.queriesandjoins.models.CityModel;
import com.codingdojo.queriesandjoins.models.CountryModel;
import com.codingdojo.queriesandjoins.models.LanguageModel;
import com.codingdojo.queriesandjoins.services.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	private ApiService apiService;
	
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}
	
	@GetMapping("/co")
	public List<CountryModel> pathAllCountries() {
		return this.apiService.getAllCountries();
	}
	
//  6. What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a life expectancy greater than 75 years?
	
	@GetMapping("/co/coma")
	public List<CountryModel> pathAllConstMonarcCountries() {
		return this.apiService.getAllConstMonarcCountries();
	}
	
	@GetMapping("/ci")
	public List<CityModel> pathAllCities() {
		return this.apiService.getAllCities();
	}
	
//  3. What query would you run to get all the cities in Mexico with a population of greater than 500,000? Your query should arrange the result by population in descending order.
	
	@GetMapping("/ci/mexico")
	public List<CityModel> pathParamMexicanCities() {
		return this.apiService.getParamMexicanCities();
	}
	
	@GetMapping("/la")
	public List<LanguageModel> pathAllLanguages() {
		return this.apiService.getAllLanguages();
	}
	
	@GetMapping("/co/{name}")
	public List<CountryModel> pathOneCountryByName(@PathVariable("name") String name) {
		return this.apiService.getCountryByName(name);
	}

//	2. What query would you run to display the total number of cities for each country? Your query should return the name of the country and the total number of cities.
//      Your query should arrange the result by the number of cities in descending order.
	
	@GetMapping("/co/city_count")
	public List<Object[]> pathCountriesByCitiesCounted() {
		return this.apiService.getCountriesByCitiesCounted();
	}
	
//  // 8. What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. Also, the query should
	//     arrange the result by the number of countries in descending order.
	
	@GetMapping("/co/region")
	public List<Object[]> pathCountryByRegion() {
		return this.apiService.getCountryByRegion();
	}

//	7. What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000? The query should return
//  	the Country Name, City Name, District, and Population.
	
	@GetMapping("/co/pbac")
	public List<Object[]> pathBuenosAiresCities() {
		return this.apiService.getParamBuenosAiresCities();
	}
	
	
//	1. What query would you run to get all the countries that speak Slovene? Your query should return the name of the country, language, and language percentage.
//		Your query should arrange the result by language percentage in descending order.
	
	@GetMapping("/la/co/{topLang}")
	public List<Object[]> pathCountryByTopLanguage(@PathVariable("topLang")String topLang){
		return this.apiService.getCountryByTopLanguage(topLang);
	}
	
// 4. What query would you run to get all languages in each country with a percentage greater than 89%? Your query should arrange the result by percentage in descending order.
	
	@GetMapping("/la/co/notop")
	public List<Object[]> pathCountryByParamLanguage() {
		return this.apiService.getCountryByParamLanguage();
	}
	
// 5. What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?
	
	@GetMapping("/co/highdc")
	public List<CountryModel> pathHDensityCountries() {
		return this.apiService.getHDensityCountries();
	}
}
