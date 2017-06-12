package com.phamqtri.userinformation;

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
// @WebServlet("/Draw")
public class Draw extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the value for the query parameter
		String heightString = request.getParameter("height");
		String widthString = request.getParameter("width");
		int height = 0;
		int width = 0;		
		
		if (heightString != null) {
			height = Integer.parseInt(heightString);
		}
		if (widthString != null) {
			width = Integer.parseInt(widthString);
		}
		
		// Sets the content type of the response
		response.setContentType("text/html");
		// Sets stylesheet
		String cssLocation = request.getContextPath() + "/WebContent/css/styles.css";
	    String cssTag = "<link rel='stylesheet' type='text/css' href='css/styles.css'>";
		
		// writes the response
		PrintWriter out = response.getWriter();
		out.write("<html>");
		out.write("<head>");
		out.write("<title>Checker Board</title>");
		out.write(cssTag);
		out.write("</head>");
		out.write("<body>");
		out.write("<h1>Checker Board: " + height + "h x " + width + "w</h1>");
		while (height > 0) {
			if (height%2 != 0) {
				for (int i = 0; i < width; i++) {
					if (i%2 != 0) {
						if (i == width - 1) {
							out.write("<div class='blue-field'></div><br>");
						}
						else {
							out.write("<div class='blue-field'></div>");
						}
					}
					else {
						if (i == width - 1) {
							out.write("<div class='purple-field'></div><br>");
						}
						else {
							out.write("<div class='purple-field'></div>");
						}
					}
				}
			}
			else {
				for (int i = 0; i < width; i++) {
					if (i%2 != 0) {
						if (i == width - 1) {
							out.write("<div class='purple-field'></div><br>");
						}
						else {
							out.write("<div class='purple-field'></div>");
						}
					}
					else {
						if (i == width - 1) {
							out.write("<div class='blue-field'></div><br>");
						}
						else {
							out.write("<div class='blue-field'></div>");
						}
					}
				}
			}
			height--;
		}
		out.write("</body>");
		out.write("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
