package com.codingdojo.ninjagold.controllers;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	// index page route
	@RequestMapping("/")
	public String indexNinjaGold(HttpSession session) {		
		Integer sessionGold = (Integer) session.getAttribute("sessionGold");
		if(sessionGold == null) {
			session.setAttribute("sessionGold", 0);
			session.setAttribute("currentGold", 0);
			ArrayList<String> sessionLog = new ArrayList<String>();
			session.setAttribute("sessionLog", sessionLog);
			session.setAttribute("sessionColor", "text-success");
		}
		return "index.jsp";
	}
	@PostMapping("/process_money")
	public String submitNinjaGold(HttpSession sessio, @RequestParam("action") String formValue) {
		Random rNum = new Random();
		System.out.println(rNum);

		int currentGold = 0;
		
		String pattern = "MMMMM d yyyy h:mm a";
		SimpleDateFormat simpleDateFormat =new SimpleDateFormat(pattern, new Locale("en", "US"));
		String date = simpleDateFormat.format(new Date());
		System.out.println(date);

		ArrayList<String> sessionLog = (ArrayList<String>) sessio.getAttribute("sessionLog");
		
		if(formValue.equals("farm")) {
			currentGold = rNum.nextInt(20 - 10) + 10;
			sessionLog.add("You entered a " + formValue + " and earned " + currentGold + " gold. ( " + date + " ) " );
		} else if(formValue.equals("cave")) {
			currentGold = rNum.nextInt(10 - 5) + 5;
			sessionLog.add("You entered a " + formValue + " and earned " + currentGold + " gold. ( " + date + " ) " );
		} else if(formValue.equals("house")) {
			currentGold = rNum.nextInt(5 - 2) + 2;
			sessionLog.add("You entered a " + formValue + " and earned " + currentGold + " gold. ( " + date + " ) " );
		} else if(formValue.equals("casino")) {
            int oneNum = rNum.nextInt(51);
            int twoNum = rNum.nextInt((1 - 0) + 1);
            if(twoNum == 0) {
            	currentGold = oneNum;
            	sessionLog.add("You entered a " + formValue + " and earned " + currentGold + " gold. ( " + date + " ) " );            
            } else {
            	currentGold = (oneNum *= -1);
            	sessionLog.add("You entered a " + formValue + " and lost " + currentGold + " gold..Ouch. ( " + date + " ) " );
            	
            }
		}
		Collections.reverse(sessionLog);
		sessio.setAttribute("currentGold", currentGold);
		sessio.setAttribute("sessionGold", (Integer) sessio.getAttribute("sessionGold") + currentGold);
		sessio.setAttribute("sessionLog", sessionLog);
		return "redirect:/";
	}
	
	@PostMapping("/clears")
	public String sessionClear(HttpSession sessi) {
		sessi.invalidate();
		return "redirect:/";
	}
	
}