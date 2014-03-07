package br.com.mercearia.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.mercearia.dao.FuncionarioDAO;

public class LoginController extends HttpServlet{
	private int Menu;
	protected void service(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String usuario= request.getParameter("usuario");
		String senha = request.getParameter("senha");
		System.out.println(usuario + senha);
		FuncionarioDAO dao = new FuncionarioDAO();

		if (dao.checaLogin(usuario, senha)){
			HttpSession session = request.getSession();
			session.setAttribute("usuario", usuario);
			//request.setAttribute("logic", "menu");
			System.out.println("Mandando para o menu...");
			response.sendRedirect("views/Menu.jsp");
			return;
		}
		else{
			System.out.println("Errado");
			request.getRequestDispatcher("/SenhaInvalida.jsp").forward(request, response); 
		}
	}
	public int getMenu() {
		return Menu;
	}
	public void setMenu(int menu) {
		Menu = menu;
	}
}