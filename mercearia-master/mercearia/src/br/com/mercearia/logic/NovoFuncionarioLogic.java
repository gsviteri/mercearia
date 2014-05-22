package br.com.mercearia.logic;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.mercearia.dao.FuncionarioDAO;
import br.com.mercearia.modelo.Funcionario;
import br.com.mercearia.util.Conversao;

public class NovoFuncionarioLogic implements Logic {
	public void executa(HttpServletRequest request, HttpServletResponse response)
			throws Exception, ServletException {
		try {
			Funcionario funcionario = new Funcionario();
			funcionario.setCpf(Long.parseLong(request.getParameter("cpf")));
			funcionario.setNome(request.getParameter("nome"));
			funcionario.setUsuario(request.getParameter("usuario"));
			funcionario.setSenha(request.getParameter("senha"));
			try {
				funcionario.setTelefone(Long.parseLong(request
						.getParameter("telefone")));
			} catch (RuntimeException e) {
			}
			funcionario.setDataNascimento(Conversao.textoEmData(request
					.getParameter("dataNascimento")));

			FuncionarioDAO dao = new FuncionarioDAO();
			dao.adiciona(funcionario);
		} catch (RuntimeException e) {
			System.out.println(
					"NovoFuncionarioLogic falhou em adicionar um funcionario. \n ");
			e.printStackTrace();
			return;
		}
		RequestDispatcher rd = request.getRequestDispatcher("NovoCliente.jsp");
		rd.forward(request, response);
	}
}
