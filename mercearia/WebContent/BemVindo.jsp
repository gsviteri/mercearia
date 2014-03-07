
<html>
<head>
</head>
<body>

<% if(session.getAttribute("usuario") == null) { %>
<h2>Bem vindo!</h2><br />
Quem é você?
<form action="ValidandoLogin" method="post">
<select name="usuario">
<option value="Administrador">Administrador</option>
<option value=" "> </option>
</select><br />
Senha: <br><input type="password" name="senha"><br />
<input type="submit" value="Confirma" name="ValidandoLogin"><br /><br />
</form>
<% }else { response.sendRedirect("views/Menu.jsp");}%>
	
</body>
</html>