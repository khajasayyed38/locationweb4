<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>save</title>
</head>
<body>
	<h2>Save Location..</h2>
	<a href="getalllocations">see all locations</a>
	<form action="saveLocation" method="post">
	<pre>
	id:<input type="text" name="id"/>
	code:<input type="text" name="code"/>
	name:<input type="text" name="name"/>
	type:Urban<input type="radio" name="type" value="urban"/>
	Rural<input type="radio" name="type" value="rural"/>
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg}
</body>
</html>