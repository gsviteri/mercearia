<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<title>Novo funcionario</title>
</head>
<body>
<h2>Cadastro de um novo funcionario:</h2>
<br />
<form action="Control" method="post"><br />

Nome*:
 <input type="text" name="nome"><br />
CPF*:
 <input type="text" name="cpf"><br />
Usuário*:
 <input type="text" name="usuario"><br />
Senha*:
 <input type="text" name="senha"><br />
Telefone:
 <input type="text" name="telefone"><br />
Data de nascimento:
 <input type="text" name="dataNascimento"><br />
 <input type="hidden" name="logic" value="NovoFuncionarioLogic"><br />
 <input type="submit" value="Confirma">
*Preenchimento obrigatório
</form><input type="button" value="Limpa">
</body>
</html>