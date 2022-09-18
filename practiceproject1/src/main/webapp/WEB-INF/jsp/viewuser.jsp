<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2">
<tr>
<th>Id</th>
<th>First Name</th>  
<th>Last Name</th>
<th>E-mail</th>
</tr>
<c:forEach var="u" items="${userList}">
<tr>
<td>${u.id}</td>
<td>${u.fname}</td>
<td>${u.lname}</td>
<td>${u.email}</td>
</tr>
</c:forEach>
</table>
</body>
</html>
