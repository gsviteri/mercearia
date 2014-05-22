package br.com.mercearia.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.ClienteDAO;
import br.com.mercearia.modelo.Cliente;
import br.com.mercearia.util.Conversao;

public class BuscaCliente extends HttpServlet {
	ClienteDAO cdao = new ClienteDAO();

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String palavraChave = request.getParameter("palavraChave");
		String parametro = request.getParameter("parametro");
		Cliente cliente = cdao.busca(palavraChave, parametro);
		String dataNascimento = Conversao.calendarEmTexto(cliente.getDataNascimento());
		if (cliente != null) {
			//request.getSession().setAttribute("cliente", cliente);
			response.getWriter().write("<div> "+
					"<input type=\"hidden\" id=\"nome1\" value=\""+ cliente.getNome() + "\">"+
					"<input type=\"hidden\" id=\"telefone1\" value=\""+ cliente.getTelefone() + "\">"+
					"<input type=\"hidden\" id=\"doc1\" value=\""+ cliente.getDoc() + "\">"+
					"<input type=\"hidden\" id=\"email1\" value=\""+ cliente.getEmail() + "\">"+
					"<input type=\"hidden\" id=\"sexo1\" value=\""+ cliente.getSexo() + "\">"+
					"<input type=\"hidden\" id=\"data1\" value=\""+ dataNascimento + "\">"+
					"<div>");
		}
	}
}