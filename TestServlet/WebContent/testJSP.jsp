<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test</title>
</head>
<body>
<p> Ceci est une page généré depuis une JSP. </p>
<p> azazidqsdkqsksdk</p>
<p>
	<% 
	String parametre = request.getParameter("auteur");
	out.println("Je m'apelle " + parametre);
	%>
</body>
</html>
