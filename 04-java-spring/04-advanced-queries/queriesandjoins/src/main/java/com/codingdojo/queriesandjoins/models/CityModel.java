package com.codingdojo.queriesandjoins.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cities")
public class CityModel {
	@Id
	private Integer id;
	
	private String name;
	
	private String country_code;
	
	private String district;
	
	private Integer population;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id")
	private CountryModel country;
	
	public CityModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCountry_code() {
		return country_code;
	}

	public String getDistrict() {
		return district;
	}

	public Integer getPopulation() {
		return population;
	}

	public CountryModel getCountry() {
		return country;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public void setCountry(CountryModel country) {
		this.country = country;
	}
	
	
}
