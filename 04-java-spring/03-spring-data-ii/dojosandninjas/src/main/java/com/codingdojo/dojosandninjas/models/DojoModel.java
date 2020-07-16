package com.codingdojo.dojosandninjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="dojos")
public class DojoModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, max=255)
	private String name;
	
	@Column(updatable=false)
	private Date createdAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	private Date updatedAt;
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	@OneToMany(mappedBy="dojoModel", fetch=FetchType.LAZY)
	private List<NinjaModel> dojoNinjas;
	
	public DojoModel() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public List<NinjaModel> getDojoNinjas() {
		return dojoNinjas;
	}

	public void setDojoNinjas(List<NinjaModel> dojoNinjas) {
		this.dojoNinjas = dojoNinjas;
	}
	
	
}