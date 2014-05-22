<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta charset="UTF-8" />
	<script src="../js/jquery.js"></script>
	<script src="../js/scripts.js"></script>
	<title>Gerencie um cliente</title>
</head>
<body>
	<h2>Gerencie um cliente</h2>	<br /> 
	Palavra Chave:
	<input type="text" id="palavraChave">
	<select id="parametro">
		<option value="nome">Nome</option>
		<option value="cpf">CPF</option>
		<option value="telefone">Telefone</option>
	</select>
	<input type="button" value="Buscar" onclick="buscaDadosCliente()">	<br /><br />
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
	<input type="text" id="dataNascimento">	<br />
	<input type="button" value="Editar" onclick="editaDados()">
	<input type="button" value="Excluir" id="btn">
	<input type="hidden" id="form" value="ProcuraClienteLogic">
	<div id="fim"></div>
</body>
</html>