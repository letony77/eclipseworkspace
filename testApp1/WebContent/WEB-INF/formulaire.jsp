<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 	<form action = "test1" method="post"> -->
<!-- 		<label for="nom">Nom <span class="requis">*</span></label> -->
<!--                 <input type="text" name="nom" value="" size="20" maxlength="60" /> -->
<!--                 <br /> -->
                
<!--          <label for="prenom">Prénom <span class="requis">*</span></label> -->
<!--                 <input type="text" name="prenom" value="" size="20" maxlength="60" /> -->
<!--                 <br /> -->
<!--                 <button>Valider</button> -->
<!-- 	</form> -->


        <form method="post" action="login">
            <label for='nom'>nom :</label>
            <input id='nom' name='txtLogin' type='text' value='' autofocus /> <br/>
            <label for='prenom'>prenom :</label>
            <input name='prenom' type='text' value='' /> <br/>
            <br/>
            <input name='btnConnect' type='submit' /> <br/>
        </form>  

</body>
</html>