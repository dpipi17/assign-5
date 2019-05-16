<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome and Login</title>
</head>
<body>

<h1> Welcome to Homework 5 </h1>

<p> Please log in. </p> 

<form action="LoginServlet" method="post"> 

    <label for="username"><b> User name: </b></label>
    <input id="username" type="text" name="username" required>
    <br>

    <label for="password"><b> Password: </b></label>
    <input id="password" type="password" name="password" required>

    <button type="submit">Login</button>
    
    <br>  
</form>

<a href="createAccount.jsp"> Create New Account </a>

</body>
</html>