<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<center>
		<h1>Search User</h1>
<form action=search.jsp >
	<label for=id>Enter user id :-</label> 
	<input type=id name=id id=id/><br><br>

	<input type=submit value=Search />
    <input type=reset />
</form>
</center>
