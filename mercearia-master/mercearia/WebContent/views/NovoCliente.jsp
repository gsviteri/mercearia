<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<script type="text/javascript">
	window.onload = function()
	{
		if ( "${cliente}" == "cliente") 
		{
		alert("CLiente cadastrado com sucesso!");
		}
	};
</script>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>Novo cliente</title>
</head>
<body>
<div class="titulo"><h1>Cadastro de um novo cliente:</h1></div>
<div class="esquerda"><form name="myForm" action="Control" method="post">
<p class="form">Nome*:
 <input required type="text" name="nome" id="nome" autofocus
 oninvalid="setCustomValidity('O nome do cliente � necess�rio.')"><br />
CPF:
 <input type="text" pattern="[0-9]{9}[A-Za-z0-9]{2}" name="doc"
 oninvalid="setCustomValidity('Insira o CPF, 11 digitos,somente n�meros.')"><br />
Telefone:
 <input type="text" name="telefone" min="8" max="14"><br />
Sexo:
	<select name="sexo">
		<option value="masculino">Masculino</option>
		<option value="feminino">Feminino </option>
 	</select><br />
Email: <input type="email" name="email">	<br />
Data de nascimento:
 <input type="date" name="dataNascimento" max="2012-01-01" max="1910-01-01" class="data"><br />
 <input type="hidden" name="logic" value="NovoClienteLogic">
*Preenchimento obrigat�rio<br>
 <input type="submit" value="CONFIRMA" class="bVerde"> -
 <input type="button" value="Limpa formul�rio" class="bCinza">
</p></form>
</div>
</body>
</html>