<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
</head>
<body>

<h2>Bem vindo!</h2><br />
Quem é você?<br>
<form action="ValidandoLogin" method="post">
<jsp:useBean id="dao" class="br.com.mercearia.dao.FuncionarioDAO"/>
<select name="usuario">
<c:forEach var="funcionario" items="${dao.lista}">
<option value="${funcionario.usuario}">${funcionario.usuario}</option>
</c:forEach>
</select><br><br>	
Senha: <br><input type="password" name="senha"><br /><br><br>
<input type="submit" value="Confirma"><br /><br />
</form>
</body>
</html>