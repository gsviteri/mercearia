package br.com.mercearia.logic;

import java.text.ParseException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.ProdutoDAO;
import br.com.mercearia.modelo.Produto;
import br.com.mercearia.util.Conversao;

public class NovoProdutoLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		final String teste = "teste";
		Produto produto = new Produto();
		produto.setId(Long.parseLong(request.getParameter("id")));
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Float.parseFloat(request.getParameter("valor")));
		produto.setFabricante(request.getParameter("fabricante"));
		try {
			produto.setQtd(Integer.parseInt(request.getParameter("qtd")));
		} catch (RuntimeException e) {
		}
		if(teste.equals(request.getParameter("imperecivel"))){
			produto.setVal_max(Conversao.textoEmData("01/01/9999"));
			produto.setVal_min(Conversao.textoEmData("01/01/9999"));
			System.out.println("Passou por aqui!");
			System.out.println(produto.getVal_max().getTime());
		}
		else
		{
			try {
				produto.setVal_max(Conversao.textoEmData(request
						.getParameter("val_max")));
				produto.setVal_min(Conversao.textoEmData(request
						.getParameter("val_min")));
			} catch (ParseException e) {
			}
		}
		ProdutoDAO dao = new ProdutoDAO();
		dao.adiciona(produto);

		request.setAttribute("produtoAdicionado", produto.getNome());
		RequestDispatcher rd = request.getRequestDispatcher("NovoProduto.jsp");
		rd.forward(request, response);
	}
}
