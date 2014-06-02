<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<title>Novo funcionario</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
</head>
<body>
<div class="titulo"><h1>Cadastro de um novo funcionario:</h1></div>
<form action="Control" method="post">
<div class="esquerda"><p class="form">
Nome*:
 <input type="text" name="nome" autofocus><br />
CPF*:
 <input type="text" name="cpf"><br />
Usuário*:
 <input type="text" name="usuario"><br />
Senha*:
 <input type="text" name="senha"><br />
Email:
 <input type="email" name="email"><br />
Telefone:
 <input type="text" name="telefone"><br />
Data de nascimento:
 <input type="text" name="dataNascimento"><br />
 <input type="hidden" name="logic" value="NovoFuncionarioLogic">
 *Preenchimento obrigatório<br>
 <input type="submit" value="Confirma"> 
<input type="button" value="Limpa">	</p></div>
</form>
</body>
</html>