package com.codingdojo.driverslicense.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="licenses")
public class License {

	// id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	// number
	@Size(min=1, max=255)
	private String number;
	
	// expirationDate
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date expirationDate;
	
	// state
	@Size(min=1, max=255)
	private String state;
	
	// createdAt
	@Column(updatable=false)
	private Date createdAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	// updatedAt
	private Date updateAt;
	@PreUpdate
	protected void onUpdate() {
		this.updateAt = new Date();
	}
	
	// Person-----model -----owner of the relationship
	// request model when need
	// defines (mapping) for foreign keys
	// indicates that the corresponding table to this entity has a foreign_key to the referenced table
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="person_id")
	private Person person;
	
	// constructor
	public License() {}

	public String getNumberString() {
		int numPlaces = 7 - String.valueOf(this.number).length();
		StringBuilder stringBuilder = new StringBuilder();
		for(int index = 0; index < numPlaces; index++) {
			stringBuilder.append('0');
		}
		return String.format("%s%d", stringBuilder, this.number);
	}
	
	// getters
	public Long getId() {
		return id;
	}
	
	public String getNumber() {
		return number;
	}

//	public Date getExpirationDateSimply() {
//		SimpleDateFormat fm = new SimpleDateFormat("MM-dd-yyyy")
//	}
//	
	public Date getExpirationDate() {
		return expirationDate;
	}

	public String getState() {
		return state;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public Person getPerson() {
		return person;
	}

	// setters
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
