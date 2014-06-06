package br.com.mercearia.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
		String tipo = request.getParameter("tipo");
		String palavraChave = request.getParameter("palavraChave");
		String parametro = request.getParameter("parametro");
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente = cdao.busca(palavraChave, parametro);
		response.getWriter().write("<div>");
		int i = 0;
		for (Cliente cliente : listaCliente) {
			String dataNascimento = Conversao.calendarEmTexto(cliente
					.getDataNascimento());
			if (cliente != null) {
				response.getWriter().write(
						"<input type=\"hidden\" id=\"nome" + i + "\" value=\""
								+ cliente.getNome() + "\">"
								+ "<input type=\"hidden\" id=\"telefone" + i
								+ "\" value=\"" + cliente.getTelefone() + "\">"
								+ "<input type=\"hidden\" id=\"doc" + i
								+ "\" value=\"" + cliente.getDoc() + "\">"
								+ "<input type=\"hidden\" id=\"email" + i
								+ "\" value=\"" + cliente.getEmail() + "\">"
								+ "<input type=\"hidden\" id=\"sexo" + i
								+ "\" value=\"" + cliente.getSexo() + "\">"
								+ "<input type=\"hidden\" id=\"data" + i
								+ "\" value=\"" + dataNascimento + "\">");
			}
			i++;
		}
		response.getWriter().write("</div>");
	}
}
