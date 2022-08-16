<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


		<h1 align='center'><FONT COLOR= PURPLE>FlyAway</FONT></h1>
		<h3>Personal Details</h3>
		<form action="previewServlet" method="post">
		 
		<%= session.getAttribute("onboard")%>

		FirstName: <input type="text" name="firstname"> <br>
		LastName: <input type="text" name="lastname"> <br>
		DOB: <input type="date" name="dob"><br/>
		Age: <input type="text" name="age"><br/>
		Address: <input type="text" name="addrs"><br/>
		E-mail: <input type="text" name="eid" ><br/>
		Phone.no: <input type="text" name="pno" maxlength="10" pattern="\d{10}" title="Please enter exactly 10 digits" ><br/>
			<input type="submit" value="Submit">
		</form>

</body>
</html>