<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Create Account</title>
</head>
<body>

<h1> Create New Account </h1>

<p> Please enter proposed name and password. </p> 

<form action="CreateAccountServlet" method="post"> 

    <label for="username"><b> User name: </b></label>
    <input id="username" type="text" name="username" required>
    <br>

    <label for="password"><b> Password: </b></label>
    <input id="password" type="password" name="password" required>

    <button type="submit">Login</button>
     
</form>

</body>
</html>