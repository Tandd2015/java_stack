package com.codingdojo.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
//	@RequestMapping(value="/{dojo}", method=RequestMethod.GET)
//	public String anotherDisplayText(@PathVariable("dojo") String dojo) {		
//		return "The dojo is awesome!";
//	}
//	@RequestMapping(value="/{burbank-dojo}", method=RequestMethod.GET)
//	public String anotherDisplayTextOne(@PathVariable("burbank-dojo") String burbankDojo) {
//		return "Burbank Dojo is located in Southern California";
//	}
	@RequestMapping(value="/{dojo}", method=RequestMethod.GET)
	public String anotherDisplayText(@PathVariable("dojo") String dojo) {		
		if(dojo.equals("dojo")) {
			return "The dojo is awesome!";			
		} else if(dojo.equals("burbank-dojo")) {
			dojo="{/burbank-dojo}"; 
			return "Burbank Dojo is located in Southern California";
		} else if(dojo.equals("san-jose")) {
			dojo="{/san-jose";
			return "SJ dojo is the headquarters.";
		} else {
			return "Is not a valid @PathVariable Today: " + dojo;
		}
	}
}
