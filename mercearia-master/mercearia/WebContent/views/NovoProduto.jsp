<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<link rel="stylesheet" type="text/css" href="../css/style.css">
<title>Novo Produto</title>
</head>
<body>
<div class="titulo"><h1>Cadastro de um novo produto:</h1></div>
<form action="Control" method="post">
<div class="esquerda">
<p class="form">C�digo de barras*:
 <input type="text" name="id"><br />
Nome do produto*:
 <input type="text" name="nome"><br />
Valor da unidade:
 <input type="text" name="valor"><br />
Fabricante:
 <input type="text" name="fabricante"><br />
Quantidade inicial do produto:
 <input type="text" name="qtd"><br />
Validade mais pr�xima: 
  <input type="text" name="val_min"><input type="checkbox" name="imperecivel" value="teste"> Imperec�vel<br /> 
Validade menos pr�xima:
  <input type="text" name="val_max"><br />
 *Preenchimento obrigat�rio<br>
 <input type="hidden" name="logic" value="NovoProdutoLogic">
 <input type="submit" value="Confirma"> <input type="button" value="Limpa">
 
</form>
</p></div>
</body>
</html>