package br.com.mercearia.logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.dao.FornecedorDAO;
import br.com.mercearia.dao.FuncionarioDAO;
import br.com.mercearia.dao.PedidoDAO;
import br.com.mercearia.dao.ProdutoDAO;
import br.com.mercearia.dao.ProdutoPedidoDAO;
import br.com.mercearia.modelo.Pedido;
import br.com.mercearia.modelo.Produto;
import br.com.mercearia.modelo.ProdutoPedido;
import br.com.mercearia.util.Conversao;

public class NovoFornecimentoLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		int i = 1, j = 0;
		float total = 0;

		Pedido pedido = new Pedido();
		FuncionarioDAO fudao = new FuncionarioDAO();// Funcionario
		HttpSession session = request.getSession();
		pedido.setFuncionario(fudao.busca((String) session
				.getAttribute("usuario")));
		FornecedorDAO fodao = new FornecedorDAO(); // Fornecedor
		pedido.setFornecedor(fodao.busca(request.getParameter("fornecedor")));
		pedido.setDataHora(Conversao.textoEmDataHora(request
				.getParameter("data") + " " + request.getParameter("hora")+":00")); // DataHora
		pedido.setDescricao(request.getParameter("comentario"));// Comentario

		Produto produto = new Produto();
		do {
			j = 0;
			float unid;
			int qtd;
			unid = Float.parseFloat(request.getParameter("unid" + i));
			qtd = Integer.parseInt(request.getParameter("qtd" + i++));
			System.out.println("Quantidade: " + qtd + " - Unidade: " + unid
					+ " - " + i);
			total += (qtd * unid);
			try {
				j = Integer.parseInt(request.getParameter("codigo" + i));
			} catch (RuntimeException e) {
			}

		} while (j > 0);
		pedido.setValor(total);
		PedidoDAO pedao = new PedidoDAO();
		pedido.setId(pedao.adiciona(pedido));
		// --------------------------------------------
		i = 1;
		if (Long.parseLong(request.getParameter("codigo1")) > 0) {
			ProdutoPedidoDAO ppdao = new ProdutoPedidoDAO();
			ProdutoDAO prdao = new ProdutoDAO();
			ProdutoPedido produtoPedido = new ProdutoPedido();
			do {
				j = 0;
				produto = prdao.busca(Long.parseLong(request
						.getParameter("codigo" + i)));
				produtoPedido.setProduto(produto);
				produtoPedido.setPedido(pedido);
				produtoPedido.setQtd(Integer.parseInt(request
						.getParameter("qtd" + i)));
				produtoPedido.setValor(Float.parseFloat(request
						.getParameter("unid" + i++)));
				ppdao.adiciona(produtoPedido);
				try {
					j = Integer.parseInt(request.getParameter("codigo" + i));
				} catch (RuntimeException e) {
				}
			} while (j > 0);
		}
		RequestDispatcher rd = request.getRequestDispatcher("NovoPedido.jsp");
		rd.forward(request, response);
	}
}