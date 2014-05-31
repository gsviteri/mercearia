<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<style type="text/css">
#myDiv
{
	margin-top:150px;
	margin-left:100px;
	border:2px solid;
	padding:10px 20px; 
	background:#dddddd;
	width:250px;
	border-radius:25px;
}
</style>
</head>
<body class="body">

<div id="myDiv">
<h2>Bem vindo!</h2>
<form action="ValidandoLogin" method="post">
<jsp:useBean id="dao" class="br.com.mercearia.dao.FuncionarioDAO"/>
<h3>Usu�rio</h3> <select name="usuario">
<c:forEach var="funcionario" items="${dao.lista}">
<option value="${funcionario.usuario}">${funcionario.usuario}</option>
</c:forEach>
</select>
<h3>Senha:</h3><input type="password" name="senha">
<br/><br/><input type="submit" value="Confirma"></div></h2>
</form>
</body>
</html>