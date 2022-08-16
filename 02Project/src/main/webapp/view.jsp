<%@ taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1 align='center'><FONT COLOR= PURPLE>FlyAway</FONT></h1>
		<h2>Booking Details</h2>
		<%
		
		pageContext.setAttribute("onboards", onboard);
	%>
	<ul>
    <c:forEach items="${onboards}" var="item">
        ${item}<br>
    </c:forEach>
</ul>
</body>
</html>