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

<h1 class="item">Flight Details</h1>
<%
	@SuppressWarnings("unchecked")
	HashMap<String,String> user=(HashMap<String,String>)session.getAttribute("user");
%>

<%
	@SuppressWarnings("unchecked")
	List<String[]> flights=(List<String[]>)session.getAttribute("flights");
%>

<table border="1">
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
<br>
<%out.println("<a href='Payment.jsp'><button>Proceed to Pay</a></button>");
%>
		


</form>
</div>
</body>
</html>