<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title>Nova compra</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<style type="text/css">
	
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
	width:55px;
	}
	
	.cproduto{
	
	}
	
	.cunid{
	
	}
	
	.cqtd{
	
	}
	
	.ctotal{
	
	}
	
	.copcoes{
	
	}
	
	table, th, td{
	border-collapse:collapse;
	border: 1px solid white;
	width:100%;
	}
	th{
	text-align:left;	
	background-color:#dddddd;
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
			<h1>Registro de uma nova compra:</h1>
			<p>
			Funcionário: ${usuario}
			</p>
		</div>
		<div class="cabecalho right">
			<div id="pago" class="valor"><p class="letraG"> PAGO<br/></p><p class="letraM">R$1000,00</p></div>
			<div id="troco" class="valor"><p class="letraG"> TROCO<br/></p><p class="letraM">R$987,14</p></div>
			<div id="total" class="valor"><p class="letraG"> TOTAL<br/></p><p class="letraM">R$73,88</p></div>
		</div>
	</div>
	<div id=corpo>
		<form action="Control" method="post">	
			<table>
					<tr>
						<th class="ccodigo">Código</th>
						<th class="cproduto">Produto</th>
						<th class="cunid">Unid.</th>
						<th class="cqtd">Qtd.</th>
						<th class="ctotal">Total</th>
						<th class="copcaoes">Opções</th>
					</tr>
					<tr>
						<td class="ccodigo"><input class="ccodigo" type="text" name="codigo1"></td>
						<td class="cproduto"><input class="cproduto" type="text" ></td>
						<td class="cunid"><input type="text" class="cunid" readonly></td>
						<td class="cqtd"><input class="cqtd" type="text" name="qtd1"></td>
						<td class="ctotal"><input type="text" readonly></td>
						<td><input type="button" value="  ...  "></td>
					</tr>

				</table> ##Ao preencher este, outro será gerado automáticamente!
				<br />
				<input type="hidden" name="logic" value="NovaCompraLogic">
				<input type="submit" value="Confirma"> -
				<input type="button" value="Limpa todos os produtos">
		</form>
	</div>
</body>
</html>