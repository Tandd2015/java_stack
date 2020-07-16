package com.codingdojo.javaontheweb.simpleproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Home() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String formLanguage = request.getParameter("formLanguage") == null ? "Unknown" : request.getParameter("formLanguage");
		String formFirstName = request.getParameter("formFirstName") == null ? "Unknown" : request.getParameter("formFirstName");
		String formLastName = request.getParameter("formLastName") == null ? "Unknown" : request.getParameter("formLastName");
		String formHometown = request.getParameter("formHometown") == null ? "Unknown" : request.getParameter("formHomeTown");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String section1 = "<h1>Welcome, " + formFirstName + " " + formLastName + "</h1>";
		String section2 = "<p>Your Favorite language is: " + formLanguage + "</p>";
		String section3 = "<p>Your Hometown is: " + formHometown + "</p>";
		String page1 = "<div>".concat(section1).concat(section2).concat(section3).concat("</div");
		out.write(page1);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
