<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/jquery-ui.js"></script>
<html>
<head>
</head>
<body>
<center>
<h2>Bem vindo!</h2><br />
Quem é você?<br>
<form action="ValidandoLogin" method="post">
<jsp:useBean id="dao" class="br.com.mercearia.dao.FuncionarioDAO"/>
<select name="usuario">
<c:forEach var="funcionario" items="${dao.lista}">
<option name=usuario value="${funcionario.nome}">${funcionario.nome}</option>
</c:forEach>
</select><br><br>	
Senha: <br><input type="password" name="senha"><br /><br><br>
<input type="submit" value="Confirma" name="ValidandoLogin"><br /><br />
</form>
</center>
</body>
</html>