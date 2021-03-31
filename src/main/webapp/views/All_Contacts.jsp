<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All_Contacts_Page</title>

<script type="text/javascript">

	function confirmDelete() {
		return confirm("Are you sure ???");
	}

</script>

</head>
<body>

	<h3>All Contacts</h3>

	<table border="1">
		<thead>
			<tr>
				<th>Contact ID</th>
				<th>Contact Name</th>
				<th>Contact Email</th>
				<th>Contact Number</th>
				<th>Update</th>
				<th>Delete</th>
			</tr>
		</thead>

		<tbody>
			<c:forEach items="${contacts}" var="contact">
				<tr>
					<td>${contact.id}</td>
					<td>${contact.contactName}</td>
					<td>${contact.contactEmail}</td>
					<td>${contact.contactNumber}</td>
					<td><a href="edit?cid=${contact.id}">Update</a></td>
					<td><a href="delete?cid=${contact.id}" onclick="return confirmDelete()">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<a href="home">Add New Contact</a>

</body>
</html>