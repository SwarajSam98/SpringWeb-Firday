<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css" integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu" crossorigin="anonymous">
</head>
<body>
<h2>Welcome to registration page</h2> <br>
<form action="register" method="post">
Email ID:<input type="text" name="email" class="form-control" ><br>
Name:<input type="text" name="name"><br>
Date Of Birth:<input type="text" name="dob"> <br>
City:<input type="text" name="city"><br>
<input type="submit" class= "btn btn-primary" value="register" >
</form>
</body>
</html>