<html>
<head>
<title>Nova compra</title>
</head>
<body>
<h2>Registro de uma nova compra:</h2>
<form action="novaCompra" method="post"><br />
<table border="0">
  <tr>
    <th>
Funcionário: ##NOME_FUNCIONARIO<br />
Cliente: <select value="  ...  "> <input type="button" value="Trocar"><br />
Alerta de erro.</th>
    <th>
<h3>Total: <br>
Pago:<br>
Troco:</th>

</table>
<br /><br />
<table border="1">
  <tr>
    <th>Código</th>
    <th>Produto</th>
    <th>Unid.</th>
    <th>Qtd.</th>
    <th>Total</th>
    <th>Opções</th>
  </tr>
  <tr>
    <td><input type="text" size ="11"></td>
    <td><input type="text" size="120" name="produproduto"></td>
    <td><input type="text" size ="2" readonly></td>
    <td><input type="text" size ="2" name="qtd"></td>
    <td><input type="text" size ="1" readonly></td>
    <td><input type="button" size ="1" value="  ...  "></td>
  </tr>
</table>
 ##Ao preencher este, outro será gerado automáticamente!<br />
<input type="submit" value="Confirma"> - <input type="button" value="Limpa todos os produtos">
</form> 
</body>
</html>