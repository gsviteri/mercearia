package br.com.mercearia.logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.modelo.Cliente;

public class ProcuraClienteLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		String palavraChave = request.getParameter("palavraChave");
		String parametro = request.getParameter("parametro");
		//String parametro = request.getParameter("parametro");
		ClienteDAO cdao = new ClienteDAO();
		Cliente cliente = cdao.busca(palavraChave, parametro);
		request.setAttribute("cliente", cliente);
		RequestDispatcher rd = request.getRequestDispatcher("ProcuraCliente.jsp");
		rd.forward(request, response);
	}
}
