<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Je m'appelle Jean</title>
</head>
<body background = red>
<p> Ceci est une page généré depuis une JSP</p>



<%

// String attribut =(String)request.getAttribute("attribut");
// out.println(attribut + "<br>");


// String parametre = request.getParameter("auteur");
// out.println("Je m'appelle " + parametre);

String parametre1 = request.getParameter("nom");
out.println(parametre1 + "<br>");
String parametre2 = request.getParameter("prenom");
out.println(parametre2 + "<br>");
out.println(parametre1 +" "+ parametre2 + "<br>");

String parametre3= (String)request.getAttribute("nom");
out.println(parametre3+ "<br>");

String parametre4 = (String)request.getAttribute("prenom");
out.println(parametre4+ "<br>");
out.println(parametre3 + " " + parametre4+ "<br>");


%>

</body>
</html>