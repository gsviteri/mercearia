package br.com.mercearia.logic;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.modelo.Cliente;
import br.com.mercearia.util.Convercao;

public class NovoClienteLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		Cliente cliente = new Cliente();
		cliente.setNome(request.getParameter("nome"));
		int cpf = 0;
		if (request.getParameter("cpf") != null
				&& request.getParameter("cpf") != "") {
			cpf = Integer.parseInt(request.getParameter("cpf"));
		}
		int telefone = 0;
		if (request.getParameter("telefone") != null
				&& request.getParameter("telefone") != "") {
			telefone = Integer.parseInt(request.getParameter("telefone"));
		}
		String stringSexo = request.getParameter("sexo");

		// if (request.getParameter("dataNascimento") != null){
		try {
			cliente.setDataNascimento(Convercao.textoEmData(request
					.getParameter("dataNascimento")));
		} catch (RuntimeException e) {
		}

		if (stringSexo.contains("feminino")) {
			cliente.setSexo("f");
		} else if (stringSexo.contains("masculino")) {
			cliente.setSexo("m");
		} else {
			cliente.setSexo("0");
		}

		cliente.setDoc(cpf);
		cliente.setTelefone(telefone);

		ClienteDAO dao = new ClienteDAO();
		dao.adiciona(cliente);

		request.setAttribute("nomeAdicionado", cliente.getNome());
		RequestDispatcher rd = request
				.getRequestDispatcher("views/NovoCliente.jsp");
		rd.forward(request, response);
	}
}
