package br.com.mercearia.logic;

import java.sql.Date;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.dao.ProdutoDAO;
import br.com.mercearia.modelo.Compra;
import br.com.mercearia.modelo.Produto;

public class NovaCompraLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		Date datahora = new Date(Calendar.getInstance().getTimeInMillis());
		int i = 0, qtd = 0, codigo;
		float total;
		String funcionario = request.getParameter("funcionario");
		funcionario = "Juca da Loja";
		ProdutoDAO pdao = new ProdutoDAO();
		Produto produto = new Produto();
		while (Integer.parseInt(request.getParameter("codigo" + ++i)) > 0) {
			produto = pdao.busca(codigo = Integer.parseInt(
						request.getParameter("codigo" + i)));
			total =+ ((produto.getValor()) * 
					Integer.parseInt(request.getParameter("qtd" + i)));
		}
		String cliente = request.getParameter("nomeCliente"); 
		Compra compra = new Compra();
		if (cliente != "" && cliente != null){
			ClienteDAO cdao = new ClienteDAO();
			compra.setCliente(cdao.busca(idCliente));
		}
		
		
		//--------------------------------------------
		long codigo = Integer.parseInt(request.getParameter("codigo" + i));
		int qtd = Integer.parseInt(request.getParameter("qtd" + i));

		String cliente = request.getParameter("cliente");

		ClienteDAO dao = new ClienteDAO();
		dao.adiciona(cliente);

		if (cliente != null && request.getParameter("cliente") != "") {
		}
		request.setAttribute("nomeAdicionado", cliente.getNome());
		RequestDispatcher rd = request
				.getRequestDispatcher("/views/NovoCliente.jsp");
		rd.forward(request, response);
	}
}