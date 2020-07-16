package com.codingdojo.dojosurvey.models;

public class Survey {
	// member variables
	private String firstName;
	private String lastName;
	private String dojoLocation;
	private String favoriteLanguage;
	private String textArea;
	
	// constructor
	public Survey(
			String firstName,
			String lastName,
			String dojoLocation,
			String favoriteLanguage,
			String textArea)	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setDojoLocation(dojoLocation);
		this.setFavoriteLanguage(favoriteLanguage);
		this.setTextArea(textArea);
	}
	
	// getter
	public String getFirstName() {
		return firstName;
	}
	// setter 
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	// getter
	public String getLastName() {
		return lastName;
	}
	// setter 
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	// getter
	public String getDojoLocation() {
		return dojoLocation;
	}
	// setter
	public void setDojoLocation(String dojoLocation) {
		this.dojoLocation = dojoLocation;
	}
	
	// getter 
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	// setter
	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}
	
	//getter
	public String getTextArea() {
		return textArea;
	}
	// setter
	public void setTextArea(String textArea) {
		this.textArea = textArea;
	}

}
