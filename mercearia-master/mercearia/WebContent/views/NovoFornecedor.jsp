<html>
<head>
<title>Novo fornecedor</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
	<div class="titulo"><h1>Cadastro de um novo fornecedor:</h1></div>
	<div class="esquerda"><form action="Control" method="post">
		<p class="form">
		Nome*:
			<input type="text" name="nome"><br /> 
		CNPJ:
			<input	type="text" name="cnpj"><br /> 
		Telefone: 
			<input type="text"	name="telefone"><br /> 
		Email: 
			<input type="text" name="email"><br /> 
		Endere�o: 
			<input type="text" name="endereco"><br /> 
			<input type="hidden" name="logic" value="NovoFornecedorLogic">
			*Preenchimento obrigat�rio<br>
		<input type="submit" value="Confirma"> <input type="button" value="Limpa"></p>
	</form></div>
</body>
</html>