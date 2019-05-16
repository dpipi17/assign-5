<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Please Try Again</title>
</head>
<body>

<h1> Please Try Again </h1>

<p> Either your user name or password is incorrect. Please try again. </p> 

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