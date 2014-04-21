package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mercearia.modelo.CompraProduto;

public class CompraProdutoDAO {
	private Connection connection;

	public void adiciona(CompraProduto compraProduto) {
		connection = new Conexao().getConnection();

		String sql = "insert into compraproduto "
				+ "(id_produto, id_compra, valor, qtd)"
				+ " values (?, ?, ?, ?)";
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println("8888888888" +compraProduto.getProduto().getId());
			ps.setLong(1, compraProduto.getProduto().getId());
			ps.setInt(2, compraProduto.getCompra().getId());
			ps.setFloat(3, compraProduto.getValor());
			ps.setInt(4, compraProduto.getQtd());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
