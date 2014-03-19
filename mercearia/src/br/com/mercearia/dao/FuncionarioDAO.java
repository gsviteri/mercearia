package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


import br.com.mercearia.modelo.Cliente;
import br.com.mercearia.modelo.Funcionario;

public class FuncionarioDAO {
	String sql;
	PreparedStatement ps;
	private Connection connection;

	public void adiciona(Cliente cliente) {
		connection = new Conexao().getConnection();

		sql = "insert into cliente "
				+ "(cpf, nome, telefone, sexo, dataNascimento)"
				+ " values (?, ?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(sql);

			ps.setInt(1, cliente.getCpf());
			ps.setString(2, cliente.getNome());
			ps.setInt(3, cliente.getTelefone());
			ps.setString(4, cliente.getSexo());
			ps.setDate(5, new Date(cliente.getDataNascimento()
					.getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean checaLogin(String usuario, String senha) {
		connection = new Conexao().getConnection();

		sql = "select * from funcionario" + " where nome=? and senha=?";

		try {
			ps = this.connection.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			if (rs.last() || rs.next()) {
				System.out.println("True");
				return true;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		System.out.println("false");
		return false;
	}

	public List<Funcionario> getLista() {
		connection = new Conexao().getConnection();
		String dataEmTexto;
		sql = "select * from funcionario";
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		try {
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setCpf(rs.getInt("cpf"));
				funcionario.setNome(rs.getString("nome"));
				funcionario.setTelefone(rs.getInt("telefone"));
				dataEmTexto = rs.getString("dataNascimento");
				try {
					Calendar dataNascimento;

					java.util.Date date = new SimpleDateFormat("dd/MM/yyyy")
							.parse(dataEmTexto);
					dataNascimento = Calendar.getInstance();
					dataNascimento.setTime(date);
					funcionario.setDataNascimento(dataNascimento);
					System.out.println(funcionario.getNome());
				} catch (ParseException e) {
					System.out.println("Erro de conversão.");
				}
				
				listaFuncionario.add(funcionario);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaFuncionario;
		
	}
}