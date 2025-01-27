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
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Size(min=1)
	private String insertQ;
	
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
	
	@OneToMany(mappedBy="question", fetch=FetchType.LAZY)
	private List<Answer> answers;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "questions_tags",
				joinColumns = @JoinColumn(name="question_id"),
				inverseJoinColumns = @JoinColumn(name="tag_id")
	)
	private List<Tag> tags;
	
	public Question() {}
	
	public Question(String insertQ, List<Tag> tags) {
		this.insertQ = insertQ;
		this.tags = tags;
	}

	public Long getId() {
		return id;
	}

	public String getInsertQ() {
		return insertQ;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public List<Tag> getTags() {
		return tags;
	}
	
	public List<Answer> getAnswers() {
		return answers;
	}
	
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setInsertQ(String insertQ) {
		this.insertQ = insertQ;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
}