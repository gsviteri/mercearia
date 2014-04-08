package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mercearia.modelo.Compra;

public class CompraDAO {
	private Connection connection;

	public void adiciona(Compra compra) {
		connection = new Conexao().getConnection();

		String sql = "insert into compra "
				+ "(datahora, valor, id_funcionario, id_cliente)"
				+ " values (?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps.setDate(1, new Date(compra.getHora().getTimeInMillis()));
			ps.setFloat(2, compra.getValor());
			ps.setLong(3, compra.getFuncionario().getCpf());
			ps.setInt(4, compra.getCliente().getId());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
