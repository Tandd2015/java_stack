package com.codingdojo.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.repositories.SongRepository;

@Service
public class SongService {
	
	// static variable
	private final SongRepository songRepository;
	
	// constructor
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	
	// creates a list of all the songs
	public List<Song> allSongsFind() {
		return songRepository.findAll();
	}
	
	// creates a list of top ten rated
	public List<Song> topTenSongs() {
		return songRepository.findTop10ByOrderByRating();
	}

	// creates a list of songs with artist contained
	public List<Song> allSongsSearch(String artist) {
		return songRepository.findByArtistContaining(artist);
	}
	
	// finds one song
	public Song oneSongFind(Long id) {
		return songRepository.findById(id).orElse(null);
	}
	
	// deletes one song with id with return
	public Song oneSongDelete(Long id) {
		Song deletedSong = songRepository.findById(id).orElse(null);
		songRepository.deleteById(id);
		return deletedSong;
	}
	
	// deletes one song with id no return
	public void oneSongDeleteNR(Long id) {
		songRepository.deleteById(id);
	}
	// creates one song
	public Song oneSongCreate(Song song) {
		return songRepository.save(song);
	}
	
	// updates one song
	public Song oneSongUpdate(Song song) {
		return songRepository.save(song);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
