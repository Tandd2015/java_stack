package com.codingdojo.lookify.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.lookify.models.Song;
import com.codingdojo.lookify.services.SongService;

@Controller
public class SongController {
	// static variable
	private final SongService songService;
	
	// Controller constructor
	public SongController(SongService songService) {
		this.songService = songService;
	}
	
	// displays the index.jsp file 
	@RequestMapping("/")
	public String indexPage() {
		return "/index.jsp";
	}
	
	// displays the songsDashboard.jsp file
	// creates list of all songs
	@RequestMapping("/songs")
	public String showAllSongs(Model model) {
		model.addAttribute("songs", songService.allSongsFind());
		return "/songsDashboard.jsp";
			
	}
	
	// displays the show.jsp file
	// displays individual song
	@RequestMapping("/songs/{id}")
	public String showOneSong(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", songService.oneSongFind(id));
		return "/show.jsp";
	}
	
	// displays the searched.jsp file
	// creates a list of songs by one artist
	@RequestMapping("/search/{artist}")
	public String searchAllSongs(@PathVariable("artist") String artist, Model model) {
		model.addAttribute("artist", artist);
		model.addAttribute("songs", songService.allSongsSearch(artist));
		return "/searched.jsp";
	}
	
	// redirects after search submit
	// posting the RequestParam to the route PathVariable of another method
	@PostMapping("/search")
	public String searchAllForArtist(@RequestParam(value="artist") String artist) {
		return "redirect:/search/" + artist;
	}
	
	// displays the new.jsp file
	@RequestMapping("/songs/new")
	public String indexNewPage(@ModelAttribute("song") Song song) {
		return "/new.jsp";
	}
	
	// displays the new.jsp file or redirects 
	// creates one new song
	@PostMapping("/songs")
	public String createOneSong(@Valid @ModelAttribute("song") Song song, BindingResult result) {
		if(result.hasErrors())
			return "/new.jsp";
		songService.oneSongCreate(song);
		return "redirect:/songs";
	}
	
	// redirects after delete
	// deletes one song
	@DeleteMapping("/songs/{id}")
	public String deleteOneSong(@PathVariable("id") Long id) {
		songService.oneSongDelete(id);
		return "redirect:/songs";
	}
	
	// displays the topTen.jsp file
	// creates a list of the top ten rated
	@RequestMapping("/search/topTen")
	public String showTopTenSongs(Model model) {
		model.addAttribute("songs", songService.topTenSongs());
		return "/topTen.jsp";
	}
	
}
