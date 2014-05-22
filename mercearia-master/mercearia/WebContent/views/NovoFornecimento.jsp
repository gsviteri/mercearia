<html>
<head>
<script type="text/javascript"  src="../js/scripts.js"></script>
<title>Novo fornecimento</title>
</head>
<body>
<h2>Cadastro de um novo fornecimento:</h2>
<br />
<form action="Control" method="post"><br />
Fornecedor*:
 <input type="text" name="fornecedor"><br />
Data*:
 <input type="text" name="data"><br />
Hora*:
 <input type="text" name="hora"><br />
Comentário:
 <input type="text" name="comentario"><br />
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
    <td><input type="text" size ="16" name ="codigo1"></td>
    <td><input type="text" size="120"></td>
    <td><input type="text" size ="2" name ="unid1"></td>
    <td><input type="text" size ="2" name="qtd1"></td>
    <td><input type="text" size ="1" readonly></td>
    <td><input type="button" size ="1" value="  ...  "></td>
  </tr>
  <tr>
    <td><input type="text" size ="16" name ="codigo2"></td>
    <td><input type="text" size="120"></td>
    <td><input type="text" size ="2" name ="unid2"></td>
    <td><input type="text" size ="2" name="qtd2"></td>
    <td><input type="text" size ="1" readonly></td>
    <td><input type="button" size ="1" value="  ...  "></td>
  </tr>
  <tr>
    <td><input type="text" size ="16" name ="codigo3"></td>
    <td><input type="text" size="120"></td>
    <td><input type="text" size ="2" name ="unid3"></td>
    <td><input type="text" size ="2" name="qtd3"></td>
    <td><input type="text" size ="1" readonly></td>
    <td><input type="button" size ="1" value="  ...  "></td>
  </tr>
</table>

 

 <input type="hidden" name="logic" value="NovoFornecimentoLogic"><br />
 <input type="submit" value="Confirma">
*Preenchimento obrigatório
</form><input type="button" value="Limpa">
</body>
</html>