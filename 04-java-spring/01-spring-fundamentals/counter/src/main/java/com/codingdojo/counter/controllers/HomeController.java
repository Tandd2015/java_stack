package com.codingdojo.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String indexLoad(HttpSession sessio) {
		int currentCount = getCountOfSession(sessio);
		setCountOfSession(sessio, ++currentCount);
		return "homepage.jsp";
	}
	
	@RequestMapping("/counter")
	public String counterLoadIndex(HttpSession sess, Model model) {
		model.addAttribute("countVisits", getCountOfSession(sess));
		return "index.jsp";
	}
	
	@RequestMapping("/resetiteser")
	public String resetCountOfSession(HttpSession sessi) {
		sessi.invalidate();
		return "redirect:/";
	}
	@RequestMapping("/two")
	public String indexLoadTwo(HttpSession se) {
		int currentCount = getCountOfSession(se);
		setCountOfSession(se, ++currentCount);
		return "indextwo.jsp";
	}
	@RequestMapping("/two/{times}")
	public String counterLoadIndexTwo(@PathVariable("times") String times, HttpSession ses) {
		int time = 0;
		int currentCount = getCountOfSession(ses); 
		currentCount += time;
		setCountOfSession(ses, currentCount);
		return "redirect:/";
	}
	
	
	// getter indexLoad
	private int getCountOfSession(HttpSession session) {
		Object sessionValue = session.getAttribute("countVisits");
		if(sessionValue == null) {
			setCountOfSession(session, 0);
			sessionValue = session.getAttribute("countVisits");
			
		}
		return (Integer)sessionValue;
	}
	
	// setter indexLoad
	private void setCountOfSession(HttpSession session, int value) {
		session.setAttribute("countVisits", value);
	}
	
}
