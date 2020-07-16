package com.codingdojo.dojooverflow.models;

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
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="tags")
public class Tag {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1, max=255)
	private String insertT;
	
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
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "questions_tags",
				joinColumns = @JoinColumn(name="tag_id"),
				inverseJoinColumns = @JoinColumn(name="question_id")
	)
	private List<Question> questions;
	
	public Tag() {}
	
	public Tag(String insertT) {
		this.insertT = insertT;
	}
	
	public Tag(String insertT, List<Question> questions) {
		this.questions = questions;
		this.insertT = insertT;
	}

	public Long getId() {
		return id;
	}

	public String getInsertT() {
		return insertT;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInsertT(String insertT) {
		this.insertT = insertT;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}