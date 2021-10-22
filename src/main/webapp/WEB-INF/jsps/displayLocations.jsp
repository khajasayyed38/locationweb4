<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>locations</title>
</head>
<body>
	<h2>Display All Locations</h2>
	<a href="showlocation">Click to add location</a>
	<table border='1'>
	<tr>
	<th>Id<th>
	<th>code</th>
	<th>name</th>
	<th>type</th>
	</tr> 
	 <c:forEach items="${locations}" var="location">
		<tr>
			<td>${location.id}</td>
			<td>${location.code}</td>
			<td>${location.name}</td>
			<td>${location.type}</td>
		
		</tr>
	
	</c:forEach> 
	</table>
	
	
</body>
</html>