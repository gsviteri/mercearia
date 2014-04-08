package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mercearia.modelo.Fornecedor;

public class FornecedorDAO {
	private Connection connection;

	public void adiciona(Fornecedor fornecedor) {
		connection = new Conexao().getConnection();
		String sql = "insert into fornecedor "
				+ "(nome, cnpj, telefone, email)" + " values (?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setString(1, fornecedor.getNome());
			if (fornecedor.getCnpj() >= 0) {
				ps.setLong(2, fornecedor.getCnpj());
			}

			if (fornecedor.getTelefone() >= 0) {
				ps.setLong(3, fornecedor.getTelefone());
			}
			if (fornecedor.getEmail() != null) {
				ps.setString(4, fornecedor.getEmail());
			}

			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
