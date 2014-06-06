<html>
<head>
<title>Menu principal</title>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<script type="text/javascript" src="../js/jquery.js"></script>
<script type="text/javascript" src="../js/jquery-ui.js"></script>
<script type="text/javascript">
	$(function() {
		$("#accordion").accordion({
		        collapsible: true,
				active: false,
				heightStyle:"content"				
 		});
	});	
</script>
<style type="text/css">
#accordion{
	margin-top:30px;
	position:fixed;
	border:2px solid;
	padding:20px 20px; 
	background:#dddddd;
	width:80px;
	border-radius:25px;
}
.opcao{
	text-align:center;
	margin:8;
}
a { 
	text-decoration:none; 
	font-size: 10px;
	color:#666666;
	font-weight:bold; 
}
</style>
</head>
<body class="body">
<div id="accordion" class="menu">
		<img src="../images/Cliente.jpg" alt="Cliente" height="75" width="75" title="Cliente">
		<div>
			<p class="opcao"><a href="NovoCliente.jsp" target="ctn" >NOVO</a></p>
			<p class="opcao"><a href="ProcuraCliente.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Compra.jpg" alt="Compra" height="75" width="75" title="Compra">
		<div>
			<p class="opcao"><a href="NovaCompra.jsp" target="ctn">NOVA</a></p>
			<p class="opcao"><a href="ProcuraCompra.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Produto.jpg" alt="Produto" height="75" width="75" title="Produto">
		<div>
			<p class="opcao"><a href="NovoProduto.jsp" target="ctn">NOVO</a></p>
			<p class="opcao"><a href="ProcuraProduto.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Fornecimento.jpg" alt="Fornecimento" height="75" width="75" title="Fornecimento">
		<div>
			<p class="opcao"><a href="NovoFornecimento.jsp" target="ctn">NOVA</a></p>
			<p class="opcao"><a href="ProcuraFornecimento.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Fornecedor.jpg" alt="Fornecedor" height="75" width="75" title="Fornecedor">
		<div>
			<p class="opcao"><a href="NovoFornecedor.jsp" target="ctn">NOVO</a></p>
			<p class="opcao"><a href="ProcuraFornecedor.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Funcionario.jpg" alt="Funcionario" height="75" width="75" title="Funcionario">
		<div>
			<p class="opcao"><a href="NovoFuncionario.jsp" target="ctn">NOVO</a></p>
			<p class="opcao"><a href="ProcuraFuncionario.jsp" target="ctn">EXISTENTE</a></p>
		</div>
		<img src="../images/Relatorio.jpg" alt="Relatorio" height="75" width="75" title="Relatório">
		<div>
			<p class="opcao"><a href="exemploJSF.jsf" target="ctn">GERENCIAR</a></p>
		</div>
	<div class="content">
		<iframe name="ctn" width="1200px" height="650px" frameBorder="0"></iframe>
	</div>
	

</body>
</html>