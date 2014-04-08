package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.mercearia.modelo.Cliente;

public class ClienteDAO {
	private Connection connection;

	public void adiciona(Cliente cliente) {
		connection = new Conexao().getConnection();
		//
		String sql = "insert into cliente "
				+ "(cpf, nome, telefone, sexo, email, dataNascimento)"
				+ " values (?, ?, ?, ?, ?, ?)";
		// adicionar um switch case aqui!! para os diferentes tipos de cadastro
		// (com email, sem data, etc)
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setLong(1, cliente.getDoc());
			ps.setString(2, cliente.getNome());
			ps.setLong(3, cliente.getTelefone());
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getEmail());
			ps.setDate(6, new Date(cliente.getDataNascimento().getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public Cliente busca(String nome) {
		connection = new Conexao().getConnection();

		String sql = "select * from funcionario" + " where nome=? and senha=?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps = this.connection.prepareStatement(sql);
			ps.setString(1, nome);
			ResultSet rs = ps.executeQuery();
			Cliente cliente = new Cliente();
			cliente.setId(rs.getInt("id.cliente"));
			cliente.setNome(rs.getString("nome"));
			cliente.setDoc(rs.getLong("cpf"));
			cliente.setTelefone(rs.getInt("telefone"));
			cliente.setSexo(rs.getString("sexo"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(rs.getDate("dataNascimento"));
			cliente.setDataNascimento(calendar);
			cliente.setEmail(rs.getString("email"));
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}

}
