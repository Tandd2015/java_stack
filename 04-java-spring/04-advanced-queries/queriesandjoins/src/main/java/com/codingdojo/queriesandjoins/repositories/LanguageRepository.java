package com.codingdojo.queriesandjoins.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.queriesandjoins.models.LanguageModel;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageModel, Integer> {
	// findAll LanguageModels
	List<LanguageModel> findAll();
	
	//	4. What query would you run to get all languages in each country with a percentage greater than 89%? Your query
	//	should arrange the result by percentage in descending order.
//	-- What query would you run to get all language in each country with a percentage greater than 89%. Your query should arrange the result by percentage in descending order.
//
//			SELECT countries.name, languages.language, languages.percentage
//			FROM countries
//			JOIN languages on countries.id = languages.country_id
//			WHERE languages.percentage > 89.0 ORDER BY languages.percentage DESC;
////	
	@Query("SELECT co.name AS country_name, la.language AS language_language, la.percentage AS language_percentage FROM CountryModel co JOIN co.languages la WHERE la.percentage > 89 ORDER BY la.percentage DESC")
	List<Object[]> findParamCountryLangs();
	
}
