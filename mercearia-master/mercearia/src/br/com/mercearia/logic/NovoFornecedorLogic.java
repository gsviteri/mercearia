package br.com.mercearia.logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.FornecedorDAO;
import br.com.mercearia.modelo.Fornecedor;

public class NovoFornecedorLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		Long cnpj = new Long(0);
		int telefone = 0;
		String nome = request.getParameter("nome");
		
		if (request.getParameter("cnpj") != null
				&& request.getParameter("cnpj") != "") {
			cnpj = Long.parseLong(request.getParameter("cnpj"));
		}
		
		if (request.getParameter("telefone") != null
				&& request.getParameter("telefone") != "") {
			telefone = Integer.parseInt(request.getParameter("telefone"));
		}
		String email = request.getParameter("email");
		String endereco = request.getParameter("endereco");
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome(nome);
		fornecedor.setCnpj(cnpj);
		fornecedor.setEmail(email);
		fornecedor.setEndereco(endereco);
		fornecedor.setTelefone(telefone);
		
		FornecedorDAO dao = new FornecedorDAO();
		dao.adiciona(fornecedor);
		RequestDispatcher rd = request
				.getRequestDispatcher("views/NovoFornecedor.jsp");
		rd.forward(request, response);
	}
}
