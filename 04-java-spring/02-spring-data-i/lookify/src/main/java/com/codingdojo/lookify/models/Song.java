package com.codingdojo.lookify.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="songs")
public class Song {
	
	// member variables
	
	// id
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	// title
	@Size(min=5, max=175)
	private String title;
	
	// artist
	@Size(min=5, max=175)
	private String artist;
	
	// rating
	@Min(1)
	@Max(10)
	private int rating;
	
	// createdAt
	@Column(updatable=false)
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date createdAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	// updatedAt
	@DateTimeFormat(pattern="dd-MM-yyyy")
	private Date updatedAt;
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
		
	}
	
	// constructors
	
	public Song() {}
	
	public Song(Long id, String title, String artist, int rating) {
		this.id = id;
		this.title = title;
		this.artist = artist;
		this.rating = rating;
	}
	
	// id getter
	public Long getId() {
		return id;
	}
	
	// id setter
	public void setId(Long id) {
		this.id = id;
	}
	
	// title getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

}	
