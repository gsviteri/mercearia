function validateForm() {
	var x = document.forms["myForm"]["nome"].value;
	if (x == null || x == "") {
		alert("Campo nome precisa ser preenchido.");
		return false;
	}
}

function buscaDadosCliente() {
	$.post("BuscaCliente", 
	{
		palavraChave : $("#palavraChave").val(),
		parametro : $("#parametro").val(),
	},
	function(data, status) 
	{
		$("#fim").html(data);
		$("#nome").val($("#nome0").val());
		if ($("#doc0").val() > 9){
		$("#doc").val("cnpj");
		}
		else {
		$("#doc").val("cpf");
		}
		$("#docNumero").val($("#doc0").val());
		$("#telefone").val($("#telefone0").val());
		$("#email").val($("#email0").val());
		$(
			"#dataNascimento").val($("#data0").val());
		var i = 0;
		var rows = "";
		while ($("#nome"+i).val() != ("" || null || undefined)){
			rows +=(
				/*"<tr id=\"celula"+i+"\" onClick=\"carregaCliente("+i+")\">"+*/
				"<tr>"+
					"<td onClick=\"carregaCliente("+i+")\"><p class=\"mao\">"+$("#nome"+i).val()+"</p></td>"+
					"<td>"+$("#doc"+i).val()+"</td>"+
					"<td>"+$("#telefone"+i).val()+"</td>"+
				"</tr>");
				i++;
		}
		$(".metadeDireita").html(
			"<table>"+
				"<tr id=\"falso\">"+
					"<td width=\"250\"><h1>Nome</h1></td>"+
					"<td width=\"100\"><h1>CPF</h1></td>"+
					"<td><h1>Telefone</h1></td>"+
				"</tr>"+
				rows+
			"</table>"
		);
	});
}

function excluiDados() {

}

function editaDados() {

}

function carregaCliente(i){
	$("#nome").val($("#nome"+i).val());
	if ($("#doc"+i).val() > 9){
	$("#doc").val("cnpj");
	}
	else {
	$("#doc").val("cpf");
	}
	$("#docNumero").val($("#doc"+i).val());
	$("#telefone").val($("#telefone"+i).val());
	$("#email").val($("#email"+i).val());
	$(
		"#dataNascimento").val($("#data"+i).val());
}