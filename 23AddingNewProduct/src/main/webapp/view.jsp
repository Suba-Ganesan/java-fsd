<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Books</title>
</head>
<body>

	<h1> List</h1>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Price</th>
		</tr>
		<c:forEach var="List" items="${Products}">
			<tr>
				<td>${List.id}</td>
				<td>${List.name}</td>
				<td>${List.price}</td>
			</tr>
		</c:forEach>
	</table>
	<br/>
	<a href="ProductForm.html">Home</a>
</body>
</html>