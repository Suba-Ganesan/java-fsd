<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<div align="center">
		<h1><FONT COLOR= PURPLE>FlyAway</FONT></h1>
		</div>
<br>
<center>
<h3><FONT COLOR= neon>Personal Details</FONT></h3>
<div style="border:3px solid black;width:25%;border-radius:20px;padding:20px" align="center">
<form action=UserRegistration method=post>
	<label for=email>Email :-</label> <input type="email" name=email id=email /><br><br>
		<label for=age>Age:-</label> <input type="text" name=age id=age required/><br><br>
	<label for=name>Name :-</label> <input type="text" name=name id=name required /><br><br>
	<label for=phno>Phone No. :-</label> <input type="text" name=phno id=phno required/><br><br>
	<label for=adno>Aadhaar No. :-</label> <input type="text" name=adno id=adno required/><br><br>
	<input type=submit value=submit /> 
</form>
</div>
</center>
</body>
</html>