package br.com.mercearia.logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.dao.CompraDAO;
import br.com.mercearia.dao.CompraProdutoDAO;
import br.com.mercearia.dao.FuncionarioDAO;
import br.com.mercearia.dao.ProdutoDAO;
import br.com.mercearia.modelo.Compra;
import br.com.mercearia.modelo.CompraProduto;
import br.com.mercearia.modelo.Funcionario;
import br.com.mercearia.modelo.Produto;

public class NovaCompraLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		int i = 1, j = 0;
		float total = 0;
		boolean boo = false;

		FuncionarioDAO fdao = new FuncionarioDAO();
		Funcionario funcionario = new Funcionario();
		HttpSession session = request.getSession();
		funcionario = fdao.busca((String) session.getAttribute("usuario"));
		ProdutoDAO pdao = new ProdutoDAO();
		Produto produto = new Produto();
		do {
			j = 0;
			System.out.println(request.getParameter("codigo"+i)+request.getParameter("qtd"+i));
			produto = pdao.busca(Long.parseLong(request.getParameter("codigo"+i)));
			total +=((produto.getValor()) * Integer.parseInt(request
					.getParameter("qtd" + i)));
			System.out.println("--------" + i+" - " + total);
			i++;
			try {
				j = Integer.parseInt(request.getParameter("codigo" + i));
			} catch (RuntimeException e) {
			}

		} while (j > 0);
		//String cliente = request.getParameter("nomeCliente");
		Compra compra = new Compra();
		/*if (cliente != "" && cliente != null) { // ** Esse trecho eh um pequeno ajuste ... **
			ClienteDAO clidao = new ClienteDAO();
			compra.setCliente(clidao.busca(cliente, ""));
			boo = true;
		}*/
		compra.setFuncionario(funcionario);
		compra.setValor(total);
		CompraDAO comdao = new CompraDAO();
		if (boo) {
			compra.setId(comdao.adicionaC(compra));
		} else {
			compra.setId(comdao.adiciona(compra));
		}
		// --------------------------------------------
		i = 1;
		if (Integer.parseInt(request.getParameter("codigo1")) > 0) {
			CompraProdutoDAO cpdao = new CompraProdutoDAO();
			CompraProduto compraProduto = new CompraProduto();
			do {
				j = 0;
				produto = pdao.busca(Long.parseLong(request
						.getParameter("codigo" + i)));
				compraProduto.setProduto(produto);
				compraProduto.setCompra(compra);
				System.out.println(compraProduto.getCompra().getId());
				compraProduto.setQtd(Integer.parseInt(request
						.getParameter("qtd" + i)));
				compraProduto.setValor(produto.getValor());
				cpdao.adiciona(compraProduto);
				i++;
				try {
					j = Integer.parseInt(request.getParameter("codigo" + i));
				} catch (RuntimeException e) {
				}
			} while (j > 0);
		}
		RequestDispatcher rd = request.getRequestDispatcher("NovaCompra.jsp");
		rd.forward(request, response);
	}
}