package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mercearia.modelo.Cliente;

public class ClienteDAO {
	private Connection connection;
	
	public void adiciona(Cliente cliente){	
		connection = new Conexao().getConnection();
		String sql = "insert into cliente " +
				"(cpf, nome, telefone, sexo, dataNascimento)" +
				" values (?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setInt(1, cliente.getCpf());
			ps.setString(2, cliente.getNome());
			ps.setInt(3, cliente.getTelefone());
			ps.setString(4, cliente.getSexo());
			ps.setDate(5, new Date(cliente.getDataNascimento().getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}