package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.mercearia.modelo.ProdutoPedido;

public class ProdutoPedidoDAO {
	private Connection connection;

	/*
	 * public Produto busca(long id) { connection = new
	 * Conexao().getConnection();
	 * 
	 * String sql = "select * from produto where id = ?";
	 * 
	 * try { Produto produto = new Produto(); PreparedStatement ps =
	 * connection.prepareStatement(sql);
	 * System.out.println(" id do produto buscado eh " + id); ps.setLong(1, id);
	 * ResultSet rs = ps.executeQuery(); while (rs.next()) {
	 * produto.setNome(rs.getString("nome")); produto.setQtd(rs.getInt("qtd"));
	 * Calendar calendar = Calendar.getInstance();
	 * calendar.setTime(rs.getDate("val_max")); produto.setVal_max(calendar);
	 * calendar.setTime(rs.getDate("val_min")); produto.setVal_min(calendar);
	 * produto.setValor(rs.getFloat("valor")); produto.setId(rs.getLong("id"));
	 * } ps.close(); connection.close(); return produto; } catch (SQLException
	 * e) { throw new RuntimeException(e); } }
	 */
	public void adiciona(ProdutoPedido produtoPedido) {
		connection = new Conexao().getConnection();
		//
		String sql = "insert into produtoPedido values (?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setLong(1, produtoPedido.getProduto().getId());
			ps.setInt(2, produtoPedido.getPedido().getId());
			ps.setInt(3, produtoPedido.getQtd());
			ps.setFloat(4, produtoPedido.getValor());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}