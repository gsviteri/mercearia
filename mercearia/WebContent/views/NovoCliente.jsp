<html>
<head>
<title>Novo cliente</title>
</head>
<body>
<h2>Cadastro de um novo cliente:</h2>
<br />
<form action="AdicionandoCliente" method="post"><br />
Nome*:
 <input type="text" name="nome"><br />
CPF/RG*:
 <input type="text" name="cpf"><br />
Telefone:
 <input type="text" name="telefone"><br />
Sexo:
 <select name="sexo">
	<option value="masculino">Masculino</option>
	<option value="feminino">Feminino </option>
 </select><br /><br />
Data de nascimento:
 <input type="text" name="dataNascimento"><br />
 <input type="hidden" name="logic" value="NovoClienteLogic"><br />
 <input type="submit" value="Confirma">
*Preenchimento obrigatório
</form><input type="submit" value="Limpa">
</body>
</html>