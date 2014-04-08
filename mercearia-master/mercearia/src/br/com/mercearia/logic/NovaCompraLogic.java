package br.com.mercearia.logic;

import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.dao.CompraDAO;
import br.com.mercearia.dao.CompraProdutoDAO;
import br.com.mercearia.dao.FuncionarioDAO;
import br.com.mercearia.dao.ProdutoDAO;
import br.com.mercearia.modelo.Compra;
import br.com.mercearia.modelo.CompraProduto;
import br.com.mercearia.modelo.Funcionario;
import br.com.mercearia.modelo.Produto;
import br.com.mercearia.util.Convercao;

public class NovaCompraLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		int i = 0;
		float total = 0;
		FuncionarioDAO fdao = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		HttpSession session = request.getSession();
		funcionario = fdao.busca((String) session.getAttribute("usuario"));
		ProdutoDAO pdao = new ProdutoDAO();
		Produto produto = new Produto();
		try {
			System.out.println(request.getParameter("codigo" + 1));
			while (Integer.parseInt(request.getParameter("codigo" + ++i)) > 0) {
				produto = pdao.busca(Integer.parseInt(request
						.getParameter("codigo" + i)));
				total = +((produto.getValor()) * Integer.parseInt(request
						.getParameter("qtd" + i)));
			}
		} catch (RuntimeException e) {
		}
		String cliente = request.getParameter("nomeCliente");
		Compra compra = new Compra();
		if (cliente != "" && cliente != null) {
			ClienteDAO clidao = new ClienteDAO();
			compra.setCliente(clidao.busca(cliente));
		}
		compra.setFuncionario(funcionario);
		Convercao convercao = new Convercao();
		compra.setHora(convercao.getCurrentTime());
		compra.setValor(total);
		CompraDAO comdao = new CompraDAO();
		comdao.adiciona(compra);
		// --------------------------------------------
		i = 0;
		if (Integer.parseInt(request.getParameter("codigo1")) > 0) {
			CompraProdutoDAO cpdao = new CompraProdutoDAO();
			CompraProduto compraProduto = new CompraProduto();
			while (Integer.parseInt(request.getParameter("codigo" + ++i)) > 0) {
				compraProduto.setProduto(pdao.busca(Integer.parseInt(request
						.getParameter("codigo" + i))));
				compraProduto.setCompra(compra);
				compraProduto.setQtd(Integer.parseInt(request
						.getParameter("qtd" + i)));
				compraProduto.setValor(Float.parseFloat((String) request
						.getAttribute("valor" + i)));
				cpdao.adiciona(compraProduto);
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher("NovaCompra.jsp");
		rd.forward(request, response);
	}
}