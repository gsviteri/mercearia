<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<link rel="stylesheet" type="text/css" href="../css/style.css">
	<meta charset="UTF-8" />
	<script src="../js/jquery.js"></script>
	<script src="../js/scripts.js"></script>
	<title>Gerencie um cliente</title>
</head>
<body>
	<div class="container">
	
		<div class="metadeEsquerda"><p class="margemP"><h1>Gerencie um cliente</h1></p> 
		
				Palavra Chave:
				<input type="text" id="palavraChave" autofocus>
				<select id="parametro">
					<option value="nome">Nome</option>
					<option value="cpf">CPF</option>
					<option value="telefone">Telefone</option>
				</select>
				<input type="button" value="Buscar" onclick="buscaDadosCliente()">	<br /><br />
			<p class="margemM form">	
				Nome: <input type="text" id="nome">	<br />
				<select id="doc">
					<option value="cpf">CPF</option>
					<option value="cnpj">CNPJ</option>
				</select>
				<input type="text" id="docNumero">	<br /> 
				Telefone: <input type="text" id="telefone">	<br />
				Email: <input type="text" id="email">	<br /> 
				Sexo:
				<select id="sexo">
					<option value="masculino">Masculino</option>
					<option value="feminino">Feminino</option>
				</select>	<br />
				Data de nascimento:
				<input type="date" name="dataNascimento" max="2012-01-01" max="1910-01-01" class="data">	<br />
				<input type="button" value="Editar" onclick="editaDados()"> - 
				<input type="button" value="Excluir" id="btn" class="bVermelho">
				<input type="hidden" id="form" value="ProcuraClienteLogic">
			</p>
			<div id="fim">
			</div>
		</div>
		<div class="metadeDireita"> 
		</div>
	</div>
</body>
</html>