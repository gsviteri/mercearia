<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script type="text/javascript"  src="js/scripts.js"></script>
<script type="text/javascript">
	window.onload = function()
	{
		if ( "${erro}" == "erro") 
		{
		alert("Usuário ou senha inválida, tente novamente");
		}
	};
	</script>
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
<h3>Usuário </h3>
<select name="usuario">
<jsp:useBean id="dao" class="br.com.mercearia.dao.FuncionarioDAO"/>
<c:forEach var="funcionario" items="${dao.lista}">
<option value="${funcionario.usuario}">${funcionario.usuario}</option>
</c:forEach>
</select>
<h3>Senha: </h3>
<input required type="password" name="senha">
<br/><br/><input type="submit" value="Confirma"></form></div>
</body>
</html>