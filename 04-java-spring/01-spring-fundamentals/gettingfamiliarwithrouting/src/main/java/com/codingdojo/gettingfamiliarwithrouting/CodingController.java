package com.codingdojo.gettingfamiliarwithrouting;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("coding")
public class CodingController {
	@RequestMapping("")
	public String displayTextOne() {
		return "Hello Coding Dojo";
	}
	@RequestMapping("/python")
	public String displayTextTwo() {
		return "Python/Django was Awesome!";
	}
	@RequestMapping("/java")
	public String displayTextThree() {
		return "Java/Spring is better!";
	}
}
