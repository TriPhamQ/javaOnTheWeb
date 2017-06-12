<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Draw JSP</title>
		<link rel='stylesheet' type='text/css' href='${pageContext.request.contextPath}/css/styles.css'>
	</head>
	<body>
		<% 	String heightString = request.getParameter("height");
			String widthString = request.getParameter("width");
			int height = 0;
			int width = 0;		
			
			if (heightString != null) {
				height = Integer.parseInt(heightString);
			}
			if (widthString != null) {
				width = Integer.parseInt(widthString);
			} %>
		<% 	while (height > 0) {
				if (height%2 != 0) {
					for (int i = 0; i < width; i++) {
						if (i%2 != 0) {
							if (i == width - 1) {
								%><div class='blue-field'></div><br><%
							}
							else {
								%><div class='blue-field'></div><%
							}
						}
						else {
							if (i == width - 1) {
								%><div class='purple-field'></div><br><%
							}
							else {
								%><div class='purple-field'></div><%
							}
						}
					}
				}
				else {
					for (int i = 0; i < width; i++) {
						if (i%2 != 0) {
							if (i == width - 1) {
								%><div class='purple-field'></div><br><%
							}
							else {
								%><div class='purple-field'></div><%
							}
						}
						else {
							if (i == width - 1) {
								%><div class='blue-field'></div><br><%
							}
							else {
								%><div class='blue-field'></div><%
							}
						}
					}
				}
				height--;
			} %>
	</body>
</html>