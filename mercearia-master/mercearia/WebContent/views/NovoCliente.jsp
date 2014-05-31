<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>Novo cliente</title>
</head>
<body>
<div class="titulo"><h1>Cadastro de um novo cliente:</h1></div>
<div class="esquerda"><form name="myForm" action="Control" method="post" onsubmit="return validateForm()">
<p class="form">Nome*:
 <input type="text" name="nome" id="nome"><br />
CPF/RG:
 <input type="text" name="cpf"><br />
Telefone:
 <input type="text" name="telefone"><br />
Sexo:
 <select name="sexo">
	<option value="masculino">Masculino</option>
	<option value="feminino">Feminino </option>
 </select><br />
Email: <input type="text" name="email">	<br />
Data de nascimento:
 <input type="text" name="dataNascimento"><br />
 <input type="hidden" name="logic" value="NovoClienteLogic">
*Preenchimento obrigatório<br>
 <input type="submit" value="Confirma">
<input type="button" value="Limpa">
</form></p>
</div>
</body>
</html>