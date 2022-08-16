<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*"%>
<html>
<head>
<style>
table, th, td {
  border:1px solid black;
  border-collapse: collapse;
}
</style>
</head>
<body>
	<br>
	<div align="center">
		<h1><FONT COLOR= PURPLE>FlyAway</FONT></h1>
		</div>
	<br>
	<%
	@SuppressWarnings("unchecked")
	List<String[]> flights = (List<String[]>) session.getAttribute("flights");
	
	
	if (flights != null) {
	%>

	<h3>Available Flights</h3>

	<center>
		<table style="width:60%">
			<tr>
				<th>Airline Name</th>
				<th>Time</th>
				<th>Price</th>
			</tr>



			<%
			for (String[] flight : flights) {
			%>

			<tr>
				<td><%=flight[0]%></td>
				<td><%=flight[1]%></td>
				<td><%=flight[2]%></td>
			</tr>
		</table>
	</center>
	<center>
		<!-- <a href=BookFlight.jsp>Book Now</a>
 -->	<a href=UserRegistration.jsp>Book Now</a></center>
	<%
	}
	%>


	<%
	} else {
	%>
	<h1>There are no available flights</h1>
	<a href=Home.html>Back to HomePage</a>
	<%
	}
	%>
</body>
</html>