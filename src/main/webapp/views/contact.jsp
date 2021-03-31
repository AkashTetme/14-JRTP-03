<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact_Home_Page</title>
</head>
<body>

	<h3>Contact-Service</h3>

	<form:form action="saveContact?id=${contact.id}" method="POST" modelAttribute="contact">
		
		${SuccMsg}
		<table>

			<tr>
				<td>Name:</td>
				<td><form:input path="contactName" /></td>
			</tr>

			<tr>
				<td>Email:</td>
				<td><form:input path="contactEmail" /></td>
			</tr>

			<tr>
				<td>Number:</td>
				<td><form:input path="contactNumber" /></td>
			</tr>

			<tr>
				<td></td>
				<td><button type="submit" value="Sumbit">Submit</button></td>
			</tr>

		</table>

		<a href="allContacts">Show All Contacts</a>

	</form:form>
</body>
</html>