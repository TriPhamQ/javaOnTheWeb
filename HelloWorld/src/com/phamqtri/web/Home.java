package com.phamqtri.web;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get the value for the query parameter
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String favoriteLanguage = request.getParameter("favoriteLanguage");
		String homeTown = request.getParameter("homeTown");
		if (firstName == null) {
			firstName = "unknown";
		}
		if (lastName == null) {
			lastName = "unknown";
		}
		if (favoriteLanguage == null) {
			favoriteLanguage = "unknown";
		}
		if (homeTown == null) {
			homeTown = "unknown";
		}
		// Sets the content type of the response
		response.setContentType("text/html");
		// writes the response
		PrintWriter out = response.getWriter();
		out.write("<h1>Hello World, from " + firstName + " " + lastName + "</h1>");
		out.write("<h2>Your favorite language is " + favoriteLanguage + "</h2>");
		out.write("<h2>Your hometown is " + homeTown + "</h2>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
