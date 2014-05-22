
<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<title>Novo cliente</title>
</head>
<body>
<h2>Cadastro de um novo cliente:</h2>
<br />
<form name="myForm" action="Control" method="post" onsubmit="return validateForm()"><br />
Nome*:
 <input type="text" name="nome" id="nome"><br />
CPF/RG:
 <input type="text" name="cpf"><br />
Telefone:
 <input type="text" name="telefone"><br />
Sexo:
 <select name="sexo">
	<option value="masculino">Masculino</option>
	<option value="feminino">Feminino </option>
 </select><br /><br />
Email: <input type="text" name="email">	<br />
Data de nascimento:
 <input type="text" name="dataNascimento"><br />
 <input type="hidden" name="logic" value="NovoClienteLogic"><br />
 <input type="submit" value="Confirma">
*Preenchimento obrigatório
</form><input type="button" value="Limpa">
</body>
</html>