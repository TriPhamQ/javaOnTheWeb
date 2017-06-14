package com.phamqtri.calculator.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.phamqtri.calculator.models.CalculatorModel;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String input = request.getParameter("button");
		HttpSession session = request.getSession();
		CalculatorModel calculator = new CalculatorModel();
		if (input != null) {
			
			if(input.equals("division") || input.equals("multiplication") || input.equals("subtraction") || input.equals("addition")) {
				calculator.setCurrent("");
				if (session.getAttribute("current") != null && session.getAttribute("current") != "") {
					if (session.getAttribute("operator") != null) {
						if (session.getAttribute("operator").toString().equals("equal")) {
							calculator.setResult(Float.parseFloat(session.getAttribute("current").toString()));
						}
						switch (session.getAttribute("operator").toString()) {
							case "division":
								calculator.division(Float.parseFloat(session.getAttribute("current").toString()));
								break;
							case "multiplication":
								calculator.multiplication(Float.parseFloat(session.getAttribute("current").toString()));
								break;
							case "subtraction":
								calculator.subtraction(Float.parseFloat(session.getAttribute("current").toString()));
								break;
							case "addition":
								calculator.addition(Float.parseFloat(session.getAttribute("current").toString()));
								break;
							default:
								break;
						}
						session.setAttribute("current", "");
					}
					else {
						calculator.setResult(Float.parseFloat(session.getAttribute("current").toString()));
					}
				}
				
				session.setAttribute("result", calculator.getResult());
				session.setAttribute("operator", input);
			}
			else if (input.equals("equal")) {
				if (session.getAttribute("operator") != null) {
					if (session.getAttribute("operator").toString() != "equal") {
						switch (session.getAttribute("operator").toString()) {
							case "division":
								calculator.division(Float.parseFloat(session.getAttribute("current").toString()));
								session.setAttribute("current", "");
								break;
							case "multiplication":
								calculator.multiplication(Float.parseFloat(session.getAttribute("current").toString()));
								session.setAttribute("current", "");
								break;
							case "subtraction":
								calculator.subtraction(Float.parseFloat(session.getAttribute("current").toString()));
								session.setAttribute("current", "");
								break;
							case "addition":
								calculator.addition(Float.parseFloat(session.getAttribute("current").toString()));
								session.setAttribute("current", "");
								break;
							default:
								break;
						}
					}
				}
				calculator.setCurrent("");
				session.setAttribute("current", "");
				session.setAttribute("operator", input);
				session.setAttribute("result", calculator.getResult());
				session.setAttribute("resultsHistory", calculator.getEqualResult());
			}
			else if (input.equals("c")) {
				calculator.reset();
				session.setAttribute("current", "");
				session.setAttribute("result", calculator.getResult());
				session.setAttribute("resultsHistory", calculator.getEqualResult());
			}
			else {
				if (session.getAttribute("operator") != null) {
					if (session.getAttribute("operator").toString().equals("equal")) {
						session.setAttribute("result", "");
					}
				}
				calculator.setCurrent(calculator.getCurrent() + input);
				session.setAttribute("current", calculator.getCurrent());
			}
		}

		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
