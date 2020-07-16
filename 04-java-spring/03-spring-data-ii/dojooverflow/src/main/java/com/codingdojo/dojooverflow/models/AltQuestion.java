package com.codingdojo.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class AltQuestion {
	
	@NotBlank()
	private String insertAQ;
	
	@Pattern(regexp="^(([a-zA-Z\\s])+$|([a-zA-Z\\s]+,)[a-zA-Z\\s]+){1,2}$", message="Three Entry limit must be comma seperated.")
	private String tags;
	
	@Column(updatable=false)
	private Date createdAt;
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	private Date updatedAt;
	@PostPersist
	protected void onUpdate() {		
		this.updatedAt = new Date();
	}
	
	public AltQuestion() {}
	
	public String[] splitTags() {
		return this.tags.split("\\s*,\\s*");
	}
	
	public String getInsertAQ() {
		return insertAQ;
	}

	public String getTags() {
		return tags;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setInsertAQ(String insertAQ) {
		this.insertAQ = insertAQ;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
}
