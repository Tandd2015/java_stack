package com.codingdojo.queriesandjoins.models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="languages")
public class LanguageModel {
	@Id
	private Integer id;
	
	private String country_code;
	
	private String language;
	
	private String isOfficial;
	
	private Float percentage;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="country_id")
	private CountryModel country;

	private LanguageModel() {
		
	}
	
	public Integer getId() {
		return id;
	}

	public String getCountry_code() {
		return country_code;
	}

	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}

	public String getLanguage() {
		return language;
	}

	public String getIsOfficial() {
		return isOfficial;
	}

	public Float getPercentage() {
		return percentage;
	}

	public CountryModel getCountry() {
		return country;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setIsOfficial(String isOfficial) {
		this.isOfficial = isOfficial;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	public void setCountry(CountryModel country) {
		this.country = country;
	}
	
	
}
