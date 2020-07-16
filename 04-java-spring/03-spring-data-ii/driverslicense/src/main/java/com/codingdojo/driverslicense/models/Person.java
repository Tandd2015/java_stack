package com.codingdojo.driverslicense.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="persons")
public class Person {
	
	// id
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// firstName
	@Size(min=1, max=255)
	private String firstName;
	
	// lastName
	@Size(min=1, max=255)
	private String lastName;
	
	// createdAt
	@Column(updatable=false)
	private Date createdAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	// updatedAt
	private Date updatedAt;
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date(); 
	}
	
	// license-----Model
	// represents the relationship between the two models
	// on the non-owning side of the relationship(mappedBy)
	// fetched only when need with referential integrity being preserved in ALL actions.
	@OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private License license;
	
	// constructors
	public Person() {}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
//	public Person(String firstName, String lastName, Integer number, String state, Date expirationDate) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.license.setNumber(number);
//		this.license.setState(state);
//		this.license.setExpirationDate(expirationDate);
//	}
	
	// getters
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public License getLicense() {
		return license;
	}
	
	// setters
	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setLicense(License license) {
		this.license = license;
	}
	
	
	
}
