<html>
<head>
<title>Novo cliente</title>
</head>
<body>
<h2>Cadastro de um novo cliente:</h2>
Cadastro de um novo cliente:<br />
<form action="Cliente_Adicionado" method="post"><br />
Nome:
 <input type="text" name="nome"><br />
CPF:
 <input type="text" name="cpf"><br />
Telefone:
 <input type="text" name="telefone"><br />
Sexo:
 <select name="sexo">
	<option value="masculino">Masculino</option>
	<option value="feminino">Feminino </option>
 </select><br /><br />
Data de nascimento
 <input type="text" name="dataNascimento"><br />

 <input type="hidden" name="logic" value="NovoClienteLogic">
 
 <input type="submit" value="Confirma">
</form><input type="submit" value="Limpa">
</body>
</html>