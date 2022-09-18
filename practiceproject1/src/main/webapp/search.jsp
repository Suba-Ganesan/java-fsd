<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
	<%
	String f = request.getParameter("id");
 	session.setAttribute("id", f);
	%>
<html>
<head>
<title>JSTL sql:query Tag</title>
</head>
<center>
<body>
	<h2>User Details</h2>
	<br>
	<sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
		url="jdbc:mysql://localhost/mydb" user="root" password="Wonderfu!@123" />

	<sql:query dataSource="${snapshot}" var="result">
            SELECT * from User where id='<%=session.getAttribute("id")%>';
         </sql:query>

	<table border="2">
<tr>
<th>Id</th>
<th>First Name</th>  
<th>Last Name</th>
<th>E-mail</th>
</tr>
<c:forEach var="u" items="${result.rows}">
<tr>
<td>${u.id}</td>
<td>${u.fname}</td>
<td>${u.lname}</td>
<td>${u.email}</td>
<td><a href="edituser/${u.id}">Edit</a></td>

</tr>
</c:forEach>
</table>
<c:choose>
<c:when test="${result.rowCount==0}">
	Sorry! There is no User Available for that ID
</c:when>

</c:choose>

</center>

</body>
</html>
