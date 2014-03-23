<html>
<head>
<title>Novo cliente</title>
</head>
<body>
	<h2>Cadastro de um novo fornecedor:</h2>
	<form action="Control" method="post"> <br />
		Nome:
			<input type="text" name="nome"><br /> 
		CNPJ:
			<input	type="text" name="cnpj"><br /> 
		Telefone: 
			<input type="text"	name="telefone"><br /> 
		Email: 
			<input type="text" name="email"><br /> 
		Endereço: 
			<input type="text" name="endereco"><br /> 
			<input type="hidden" name="logic" value="NovoFornecedorLogic"><br />
		<input type="submit" value="Confirma">
	</form>
</body>
</html>