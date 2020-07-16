package com.codingdojo.authone.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="users")
public class UserModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1)
	@Size(max=255)
	private String firstName;
	
	@Size(min=1)
	@Size(max=255)
	private String middleName;
	
	@Size(min=1)
	@Size(max=255)
	private String lastName;
	
	private String suffixName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birthday;
	
	@Size(min=1)
	@Size(max=255)
	private String houseAptStreet;

	@Size(min=1)
	@Size(max=255)
	private String city;
	
	@Size(min=1)
	@Size(max=255)
	private String stateProvince;
	
	@Min(1)
	@Max(1000000000)
	private Integer zipCode;
	
	@Size(min=1)
	@Size(max=255)
	private String country; 
	
	@Email()
	private String emailAddress;

	@Size(min=1)
	@Size(max=255)
	private String username;
	
	@Size(min=1)
	@Size(max=255)
	private String password;
	
	@Transient
	private String passwordConfirmation;
	
	@Column(updatable=false)
	private Date createdAt;
	
	private Date updatedAt;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "role_id")
	)
	private List<RoleModel> roleModels;
	
	public UserModel() {}
	
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSuffixName() {
		return suffixName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getHouseAptStreet() {
		return houseAptStreet;
	}

	public String getCity() {
		return city;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public Integer getZipCode() {
		return zipCode;
	}

	public String getCountry() {
		return country;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<RoleModel> getRoleModels() {
		return roleModels;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSuffixName(String suffixName) {
		this.suffixName = suffixName;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setHouseAptStreet(String houseAptStreet) {
		this.houseAptStreet = houseAptStreet;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public void setZipCode(Integer zipCode) {
		this.zipCode = zipCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setRoleModels(List<RoleModel> roleModels) {
		this.roleModels = roleModels;
	}

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
