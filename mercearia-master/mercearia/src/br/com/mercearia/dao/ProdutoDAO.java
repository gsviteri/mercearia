package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.mercearia.modelo.Produto;

public class ProdutoDAO {
	private Connection connection;

	public Produto busca(long id) {
		connection = new Conexao().getConnection();

		String sql = "select * from produto where id = ?";

		try {
			Produto produto = new Produto();
			PreparedStatement ps = connection.prepareStatement(sql);
			System.out.println(id);
			ps.setLong(1, 1);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				produto.setNome(rs.getString("nome"));
				produto.setQtd(rs.getInt("qtd"));
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(rs.getDate("val_max"));
				produto.setVal_max(calendar);
				calendar.setTime(rs.getDate("val_min"));
				produto.setVal_min(calendar);
				produto.setValor(rs.getFloat("valor"));
				produto.setId(rs.getLong("id"));
			}
			ps.close();
			connection.close();
			return produto;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}