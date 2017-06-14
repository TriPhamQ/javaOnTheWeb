<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Calculator</title>
    </head>
    <body>
    	<h1>Result: <%= session.getAttribute("result") %></h1>
    	<h1>Operator: <%= session.getAttribute("operator") %></h1>
        <h1>Input: <%= session.getAttribute("current") %></h1>
        <p>History: <%= session.getAttribute("resultsHistory") %></p>
        <a href="/Calculator/?button=1">1</a>
        <a href="/Calculator/?button=2">2</a>
        <a href="/Calculator/?button=3">3</a>
        <a href="/Calculator/?button=4">4</a>
        <a href="/Calculator/?button=5">5</a>
        <a href="/Calculator/?button=6">6</a>
        <a href="/Calculator/?button=7">7</a>
        <a href="/Calculator/?button=8">8</a>
        <a href="/Calculator/?button=9">9</a>
        <a href="/Calculator/?button=0">0</a>
        <br>
        <a href="/Calculator/?button=division">/</a>
        <a href="/Calculator/?button=multiplication">x</a>
        <a href="/Calculator/?button=subtraction">-</a>
        <a href="/Calculator/?button=addition">+</a>
        <a href="/Calculator/?button=equal">=</a>
        <br>
        <a href="/Calculator/?button=c">C</a>
    </body>
</html>