package br.com.mercearia.logic;


import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.modelo.Cliente;
import br.com.mercearia.modelo.CompraProduto;
import br.com.mercearia.util.Convercao;

public class NovaCompraLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		long codigo = Integer.parseInt(request.getParameter("codigo"));
		int qtd = Integer.parseInt(request.getParameter("qtd"));
		HttpSession session = request.getSession();
		String nomeFuncionario = (String) session.getAttribute("usuario");
		if 
		
		ClienteDAO dao = new ClienteDAO();
		dao.adiciona(cliente);
		
		request.setAttribute("nomeAdicionado", cliente.getNome());
		RequestDispatcher rd = request
				.getRequestDispatcher("/views/NovoCliente.jsp");
		rd.forward(request, response);
	}
}