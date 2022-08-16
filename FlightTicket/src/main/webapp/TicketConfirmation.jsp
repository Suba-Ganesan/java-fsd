<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page  import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<div align="center">
		<h1><FONT COLOR= PURPLE>FlyAway</FONT></h1>
</div>
<h2><FONT COLOR=green>Payment done successfully..Happy Journey!!</FONT></h2>
	<div class="container1">
<form>

<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
%>

<h3 class="item" style="color:blue;">Thank you <%=user.get("name")%> for booking with FlyAway !</h3>
<h3 align='center' class="item">Boarding Pass</h3>

<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("flights");
%>

<table align='center' border="1">
<tr>
    <th>PassengerName</th>
	<th>FlightName</th>
	<th>DepartureTime</th>
	<th>Price</th>
</tr>

<%
	for(String[] flight:flights){
%>
<tr>
<td><%=user.get("name")%>
<td><%=flight[0]%></td>
<td><%=flight[1]%></td>
<td><%=flight[2]%></td>
</tr>
</table>
<%
	}
%>
		
	<div ><input type="submit" onclick="window.print()" value="Print ticket" class="btn"  /></div>

</form>
</div>
</body>
</html>