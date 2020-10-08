<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Group Description</title>
</head>
<body>
	<h1>Team: ${group.teamName }</h1>
	<img src="<c:url value='/resources/selfie_cwu_18.jpg'/>" />

	<label for = "txtGroup">Group Description:</label>
		<p id="txtGroup" name="txtGroup">${group.groupDescription}</p>

</body>
</html>