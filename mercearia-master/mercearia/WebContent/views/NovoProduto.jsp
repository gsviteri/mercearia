<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<title>Novo Produto</title>
</head>
<body>
<h2>Cadastro de um novo produto:</h2><br />
<form action="Control" method="post"><br />
Código de barras*:
 <input type="text" name="id"><br />
Nome do produto*:
 <input type="text" name="nome"><br />
Valor da unidade:
 <input type="text" name="valor"><br />
Fabricante:
 <input type="text" name="fabricante"><br />
Quantidade inicial do produto:
 <input type="text" name="qtd"><br />
Validade mais próxima: 
  <input type="text" name="val_min"><input type="checkbox" name="imperecivel" value="teste"> Imperecível<br /> 
Validade menos próxima:
  <input type="text" name="val_max"><br />
 <br />
 <input type="hidden" name="logic" value="NovoProdutoLogic"><br />
 <input type="submit" value="Confirma">
 *Preenchimento obrigatório
</form><input type="button" value="Limpa">
</body>
</html>