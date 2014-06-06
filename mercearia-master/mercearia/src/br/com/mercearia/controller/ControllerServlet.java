package br.com.mercearia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.logic.Logic;

public class ControllerServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("usuario") == null) {
			request.getRequestDispatcher("../BemVindo.jsp").forward(request,
					response);
			return;
		}
		String parametro = null;
		parametro = request.getParameter("logic");
		String nomeDaClasse = "br.com.mercearia.logic." + parametro;
		if (parametro != null) {
			try {
				Class<?> classe = Class.forName(nomeDaClasse);
				Logic logica = (Logic) classe.newInstance();
				logica.executa(request, response);
			} catch (Exception e) {
				throw new ServletException(
						"A lógica de negócios causou uma exceção", e);
			}

		} else {
			request.getRequestDispatcher("/views/NovaCompra.jsp").forward(request,
					response);
		
		}
	}
}