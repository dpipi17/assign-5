<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<h1> Welcome <%= request.getParameter("username") %> </h1>

</body>
</html>