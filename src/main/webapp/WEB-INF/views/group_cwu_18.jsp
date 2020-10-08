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
	<h1>Group Description</h1>
	<form:form method="POST" modelAttribute="group">
		<table>
			<tr>
				<td><label>Group Description</label></td>
				<td><form:input type="text" path="groupDesciption" id="groupDesciption" />
					</td>
			</tr>
		</table>
	</form:form>
</body>
</html>