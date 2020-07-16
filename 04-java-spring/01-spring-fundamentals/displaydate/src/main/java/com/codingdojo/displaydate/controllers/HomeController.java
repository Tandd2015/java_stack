package com.codingdojo.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		Date date = new Date();
		model.addAttribute("thisTime", date);
		return "index.jsp";
	}
	@RequestMapping("/{timedate}")
	public String isTimeDate(@PathVariable("timedate") String timedate, Model model) {
		if(!timedate.equals("date") && !timedate.equals("time")) {
			return "redirect:/";
		} else {
			SimpleDateFormat dm = (timedate.equals("date"))
				? new SimpleDateFormat("EEEE,' the' dd ' of ' MMMM, YYYY")
				: new SimpleDateFormat("h:mm a");
			model.addAttribute("timedateFormat", dm.format(new java.util.Date()));
			model.addAttribute("timedate", timedate);
			return "timedateindex.jsp";
		}
	}
}
