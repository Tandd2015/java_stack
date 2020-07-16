package com.codingdojo.queriesandjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.queriesandjoins.models.CityModel;

@Repository
public interface CityRepository extends CrudRepository <CityModel, Integer> {
	// findAll CityModels
	List<CityModel> findAll();
	
	// 3. What query would you run to get all the cities in Mexico with a population of greater than 500,000? 
	//    Your query should arrange the result by population in descending order.
//	-- What query would you run to get all the cities in Mexico with a population of greater than 500,000. Your query should arrange the result by population in descending order.
//			
//			SELECT cities.name, cities.population
//			FROM countries
//			JOIN cities ON countries.id = cities.country_id
//			WHERE countries.name = 'Mexico' ORDER BY cities.population DESC;
	
	@Query("SELECT ci FROM CityModel ci JOIN ci.country co WHERE co.name = 'Mexico' AND co.population > 500000 ORDER BY co.population DESC")
	List<CityModel> mexicoCities();
	
	// 7. What query would you run to get all the cities of Argentina inside the Buenos Aires district and have the population greater than 500, 000?
	//    The query should return the Country Name, City Name, District, and Population.	
//	-- What query would you run to get all the cities of Argentina inside the Buenos Aires district and have population greater than 500, 000. The query should return the Country Name, City Name, District and Population.
//			
//			SELECT countries.name, cities.name, cities.district, cities.population
//			FROM countries
//			JOIN cities ON countries.id = cities.country_id
//			WHERE countries.name = 'Argentina' AND cities.district = 'Buenos Aires' AND cities.population > 500000;
	
	@Query("SELECT co.name AS country_name, ci.name AS city_name, ci.district AS city_district, ci.population AS city_population FROM CityModel ci JOIN ci.country co WHERE co.name = 'Argentina' AND ci.district ='Buenos Aires' AND co.population > 500000 ORDER BY ci.population DESC")
	List<Object[]> argentinaBuenosAiresCities();
}
