<html>
<head>

<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>

<script type="text/javascript"  src="../js/jquery.js"></script>
<script type="text/javascript"  src="../js/scripts.js"></script>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>Novo fornecimento</title>
<style type="text/css">

table, th, td{
	border-collapse:collapse;
	border: 1px solid white;
}

.esquerdaDiv{
float:left;
line-height:28px;
}
.ccodigo{
	width:130px;
}
.cproduto{
	width:700px;
}

.cunid{
	width:50px;
}
.cqtd{
	width:50px;
}
.ctotal{
	width:50px;
}
.esquerda{
	width:1000px;
}

</style>
</head>
<body>
<form action="Control" method="post">
<div class="titulo"><h1>Cadastro de um novo fornecimento:</h1></div>

<div class="esquerda">
	
		<div class="esquerdaDiv">
			Fornecedor*: <br /> 
			Data*:<br />
			Hora*:<br />
			Comentário:<br />
		</div>
		
		<div class="esquerdaDiv">
			<input type="text" name="fornecedor" style="width:300px;" autofocus> <br />
			<input type="date" name="data" class="data"><br />
			<input type="time" name="hora"><br />
			<textarea name="comentario" rows="3" cols="30" maxlength="130"></textarea><br />
		</div>
		
		<div class="esquerdaDiv">
			<img src="../images/lupa.jpg">
		</div>
 </div>
 
<table border="1">
  	<tr>
	    <th>Código</th>
	    <th>Produto</th>
	    <th>Unid.</th>
	    <th>Qtd.</th>
	    <th>Total</th>
	    <th></th>
  	</tr>
	<tr>
	    <td><input type="text" size ="16" class="ccodigo inputTabela" name ="codigo1"></td>
	    <td><input type="text" size="120" class="cproduto inputTabela"></td>
	    <td><input type="text" size ="2" name ="unid1" class="cunid inputTabela"></td>
	    <td><input type="text" size ="2" name="qtd1" class="cqtd inputTabela"></td>
	    <td><input type="text" size ="1" readonly class="ctotal inputTabela"></td>
    	<td><img src="../images/x.jpg"></td>
	</tr>
</table>

 

 <input type="hidden" name="logic" value="NovoFornecimentoLogic"><br />
 <input type="submit" value="Confirma"> - 
 <input type="button" value="Limpa">

</form>
</body>
</html>