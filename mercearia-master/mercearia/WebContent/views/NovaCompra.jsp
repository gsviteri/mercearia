<html>
<head>
<title>Nova compra</title>
</head>
<body>
<h2>Registro de uma nova compra:</h2>
<form action="novaCompra" method="post"><br />
Funcionário: ##NOME_FUNCIONARIO<br />
Cliente: ##NOVA_JANELA_PROCURA_CLIENTE <input type="button" value="Trocar"><br />
Alerta de erro.
<br /><br />
<table border="1">
  <tr>
    <th>Produto</th>
    <th>Unit.</th>
    <th>Total</th>
    <th>Qtd.</th>
    <th>Opções</th>
  </tr>
  <tr>
    <td><input type="text" size="120" name="produproduto"></td>
    <td><input type="text" size ="2"></td>
    <td><input type="text" size ="2"></td>
    <td><input type="text" size ="1" name="qtd"></td>
    <td><input type="button" size ="1" value="  ...  "></td>
  </tr>
</table>
 ##Ao preencher este, outro será gerado automáticamente!<br />
<input type="submit" value="Confirma"> - <input type="button" value="Limpa todos os produtos">
</form> 
</body>
</html>