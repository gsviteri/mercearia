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
		$("#fim").after(data);
		$("#nome").val($("#nome1").val());
		if ($("#doc1").val() > 9){
		$("#doc").val("cnpj");
		alert("CNPJ");
		}
		else {
		$("#doc").val("cpf");
		alert("CPF");
		}
		$("#docNumero").val($("#doc1").val());
		$("#telefone").val($("#telefone1").val());
		$("#email").val($("#email1").val());
		$("#dataNascimento").val($("#data1").val());
	});
}


function excluiDados() {

}

function editaDados() {

}