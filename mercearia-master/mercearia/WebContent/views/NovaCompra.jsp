<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Nova compra</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<style type="text/css">
	
	table, th, td
	{
	border-collapse:collapse;
	border: 1px solid white;
	}
	
	.header{
	height:200px;
	}
	
	.cabecalho{
	margin-top:0px;
	margin-left:0px;
	height:100%;
	padding:0px 0px; 
	width:500px;
	border:0;
	}
	
	.left{
	float:left;
	}
	
	.right{
	float:right;
	}
	
	.valor{
	
	margin-top:0px;
	height:80%;
	background-color:#cccccc;
	padding:0px 0px;
	width:130px;
	border-radius:20px;
	}
	
	#pago{
	float:left;
	
	}
	
	#troco{
	float:left;
	margin-left:30px;
	}
	
	#total{
	float:left;
	margin-left:30px;
	}
	
	.letraG{
	top:0px;
	text-align:center;
	font-family: impact;
	font-size: 43px;
	line-height:0px;
	}
	
	.letraM{
	top:0px;
	text-align:center;
	font-family: times new roman;
	font-size: 27px;
	line-height:40px;
	color:#444444;
	}
	
	.ccodigo{
	width:130px;
	}
	
	.cproduto{
	width:700px;
	}
	
	.cunid{
	width:80px;
	}
	
	.cqtd{
	width:100px;
	}
	
	.ctotal{
	width:80px;
	}
	
	.copcoes{
	
	}
	
	
	td{
	text-align:left;
	background-color:#eeeeeee;
	
	}


	
</style>

</head>
<body>
	<div class="header">
	
		<div class="cabecalho left">
			<div class="titulo"><h1>Registro de uma nova compra:</h1></div>
			<p>
			Funcionário: ${usuario}
			</p>
		</div>
	
		<div class="cabecalho right">
			<div id="pago" class="valor"><p class="letraG"> PAGO<br/></p><p class="letraM">R$ 0,00</p></div>
			<div id="troco" class="valor"><p class="letraG"> TROCO<br/></p><p class="letraM">R$ 0,00</p></div>
			<div id="total" class="valor"><p class="letraG"> TOTAL<br/></p><p class="letraM">R$ 0,00</p></div>
		</div>
	
	</div>
	
	<div id=corpo>
		<form action="Control" method="post">	
			
			<table>
					<tr>
						<th class="ccodigo">Código</th>
						<th class="cproduto">Produto</th>
						<th class="cunid">Unidade</th>
						<th class="cqtd">Quantidade</th>
						<th class="ctotal">Total</th>
						<th class="copcaoes"></th>
					</tr>
					<tr>
						<td class="ccodigo"><input class="ccodigo inputTabela" type="text" name="codigo1" autofocus></td>
						<td class="cproduto"><input class="cproduto inputTabela" type="text" ></td>
						<td class="cunid"><input type="text" class="cunid inputTabela" readonly></td>
						<td class="cqtd"><input class="cqtd inputTabela" type="text" class="qtd1" name="qtd1"></td>
						<td class="ctotal"><input type="text" class="ctotal inputTabela" readonly></td>
						<td><img src="../images/x.jpg"></td>
					</tr>
					<tr>
						<td class="ccodigo"><input class="ccodigo inputTabela" type="text" name="codigo2" autofocus></td>
						<td class="cproduto"><input class="cproduto inputTabela" type="text" ></td>
						<td class="cunid"><input type="text" class="cunid inputTabela" readonly></td>
						<td class="cqtd"><input class="cqtd inputTabela" type="text" class="qtd" name="qtd2"></td>
						<td class="ctotal"><input type="text" class="ctotal inputTabela" readonly></td>
						<td><img src="../images/x.jpg"></td>
					</tr>
					<tr>
						<td class="ccodigo"><input class="ccodigo inputTabela" type="text" name="codigo3" autofocus></td>
						<td class="cproduto"><input class="cproduto inputTabela" type="text" ></td>
						<td class="cunid"><input type="text" class="cunid inputTabela" readonly></td>
						<td class="cqtd"><input class="cqtd inputTabela" type="text" class="qtd" name="qtd3"></td>
						<td class="ctotal"><input type="text" class="ctotal inputTabela" readonly></td>
						<td><img src="../images/x.jpg"></td>
					</tr>
					<tr>
						<td class="ccodigo"><input class="ccodigo inputTabela" type="text" name="codigo4" autofocus></td>
						<td class="cproduto"><input class="cproduto inputTabela" type="text" ></td>
						<td class="cunid"><input type="text" class="cunid inputTabela" readonly></td>
						<td class="cqtd"><input class="cqtd inputTabela" type="text" class="qtd" name="qtd4"></td>
						<td class="ctotal"><input type="text" class="ctotal inputTabela" readonly></td>
						<td><img src="../images/x.jpg"></td>
					</tr>

				</table>
				<br />
				<input type="hidden" name="logic" value="NovaCompraLogic">
				<input type="submit" value="Confirma"> -
				<input type="button" value="Limpa todos os produtos">
		</form>
	</div>
</body>
</html>
