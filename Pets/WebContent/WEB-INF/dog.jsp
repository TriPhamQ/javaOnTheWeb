<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.phamqtri.pets.models.Dog" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Dog</title>
	</head>
	<body>
		<% 
			String name = request.getParameter("name");
			String breed = request.getParameter("breed");
			double weight = Double.parseDouble(request.getParameter("weight"));
			
			Dog dog = new Dog(name, breed, weight);
		%>
		<h1>You created a <%= dog.getBreed() %></h1>
		<h2><%= dog.getName() %> <%= dog.showAffection() %></h2>
	</body>
</html>