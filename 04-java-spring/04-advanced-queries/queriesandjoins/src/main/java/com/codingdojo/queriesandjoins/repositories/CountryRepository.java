package com.codingdojo.queriesandjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.queriesandjoins.models.CountryModel;

@Repository
public interface CountryRepository extends CrudRepository <CountryModel, Integer> {
	// findAll CountryModels
	List<CountryModel> findAll();
	
	// findOnd=e CountryModel by name
	@Query("SELECT co FROM CountryModel co WHERE co.name LIKE %?1%")
	List<CountryModel> findCountryByName(String name);

	//	5. What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000?
//	-- What query would you run to get all the countries with Surface Area below 501 and Population greater than 100,000.
//
//			SELECT countries.name, countries.surface_area, countries.population 
//			FROM countries
//			WHERE countries.surface_area < 501.00 AND countries.population > 100000;
//	
	@Query("SELECT co FROM CountryModel co WHERE co.surface_area < 501 And co.population > 100000 ORDER BY co.population DESC")
	List<CountryModel> findHDensityCountries();

	//	6. What query would you run to get countries with only Constitutional Monarchy with a surface area of more than 200 and a 
	//	life expectancy greater than 75 years?
//	-- What query would you run to get all Constitutional Monarchy Countries with a capital greater than 200 and a life expectancy greater than 75 years.
//
//			SELECT countries.name, countries.government_form, countries.capital, countries.life_expectancy
//			FROM countries
//			WHERE countries.government_form = 'Constitutional Monarchy' AND countries.capital > 200 AND countries.life_expectancy > 75.0;
//	
	@Query("SELECT co FROM CountryModel co WHERE co.government_form = 'Constitutional Monarchy' AND co.life_expectancy > 75 AND co.capital > 200")
	List<CountryModel> findConstMonarcCountries();

	//	1. What query would you run to get all the countries that speak Slovene? Your query should return the name of the country, 
//	language, and language percentage. Your query should arrange the result by language percentage in descending order.
//	-- What query would you run to get all the countries that speak Slovene. Your query should return the name of the country, language and language percentage. You query should arrange the result by language percentage in descending order.
//
//			SELECT countries.name, languages.language, languages.percentage
//			FROM countries
//			JOIN languages ON countries.id = languages.country_id
//			WHERE languages.language = 'Slovene' ORDER BY languages.percentage DESC;

	@Query("SELECT co.name AS country_name, la.language AS language_language, la.percentage AS language_percentage FROM CountryModel co INNER JOIN co.languages la WHERE la.language LIKE %?1% ORDER BY language_percentage DESC")
	List<Object[]> findCountryByLangTop(String topLang);
	
	//	2. What query would you run to display the total number of cities for each country? Your query should
	//	return the name of the country and the total number of cities. Your query should arrange the result by the number of cities in descending order.
//	-- What query would you run to display the total number of cities for each country. Your query should return the name of the country and the total number of cities. You query should arrange the result by number of cities in descending order.
//
//			SELECT countries.name, count(cities.name) AS cities
//			FROM  countries
//			JOIN cities ON countries.id = cities.country_id
//			GROUP BY countries.id ORDER BY cities DESC;
//	
	@Query("SELECT co.name AS country_name, COUNT(ci.id) AS number_of_cities FROM CountryModel co JOIN co.cities ci GROUP BY co.id ORDER BY number_of_cities DESC")
	List<Object[]> findCountryCitiesCount();
	
	//	8. What query would you run to summarize the number of countries in each region? The query should display the name of the region and the number of countries. 
	//	Also, the query should arrange the result by the number of countries in descending order.
//	-- What query would you run to summarize the number of countries in each region. The query should display the name of the region and the number of countries. Also, the query should arrange the result by number of countries in descending order.
//
//			SELECT countries.region, count(countries.id) AS countries
//			FROM countries
//			GROUP BY countries.region ORDER BY countries DESC;
//	
	@Query("SELECT co.region AS country_region, COUNT(co.id) AS number_of_countries FROM CountryModel co GROUP BY co.region ORDER BY COUNT(co.id) DESC")
	List<Object[]> findCountryByRegion();
}
