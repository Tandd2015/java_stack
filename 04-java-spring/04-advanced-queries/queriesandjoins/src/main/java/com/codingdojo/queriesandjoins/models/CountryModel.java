package com.codingdojo.queriesandjoins.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="countries")
public class CountryModel {
	
	@Id
	private Integer id;
	
	private String code;
	
	private String name;
	
	private String continent;
	
	private String region;
	
	private Float surface_area;
	
	private Short indepYear;
	
	private Integer population;
	
	private Float life_expectancy;
	
	private Float gnp;
	
	private Float gnp_old;
	
	private String local_name;
	
	private String government_form;
	
	private String head_of_state;
	
	private Integer capital;
	
	private String code2;
	
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<LanguageModel> languages;
	
	@OneToMany(mappedBy="country", fetch=FetchType.LAZY)
	private List<CityModel> cities;
	
	public CountryModel() {
		
	}

	public Integer getId() {
		return id;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getContinent() {
		return continent;
	}

	public String getRegion() {
		return region;
	}

	public Float getSurface_area() {
		return surface_area;
	}

	public Short getIndepYear() {
		return indepYear;
	}

	public Integer getPopulation() {
		return population;
	}

	public Float getLife_expectancy() {
		return life_expectancy;
	}

	public Float getGnp() {
		return gnp;
	}

	public Float getGnp_old() {
		return gnp_old;
	}

	public String getLocal_name() {
		return local_name;
	}

	public String getGovernment_form() {
		return government_form;
	}

	public String getHead_of_state() {
		return head_of_state;
	}

	public Integer getCapital() {
		return capital;
	}

	public String getCode2() {
		return code2;
	}

	public List<LanguageModel> getLanguages() {
		return languages;
	}

	public List<CityModel> getCities() {
		return cities;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setSurface_area(Float surface_area) {
		this.surface_area = surface_area;
	}

	public void setIndepYear(Short indepYear) {
		this.indepYear = indepYear;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public void setLife_expectancy(Float life_expectancy) {
		this.life_expectancy = life_expectancy;
	}

	public void setGnp(Float gnp) {
		this.gnp = gnp;
	}

	public void setGnp_old(Float gnp_old) {
		this.gnp_old = gnp_old;
	}

	public void setLocal_name(String local_name) {
		this.local_name = local_name;
	}

	public void setGovernment_form(String government_form) {
		this.government_form = government_form;
	}

	public void setHead_of_state(String head_of_state) {
		this.head_of_state = head_of_state;
	}

	public void setCapital(Integer capital) {
		this.capital = capital;
	}

	public void setCode2(String code2) {
		this.code2 = code2;
	}

	public void setLanguages(List<LanguageModel> languages) {
		this.languages = languages;
	}

	public void setCities(List<CityModel> cities) {
		this.cities = cities;
	}
	
}
