package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
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
			System.out.println(" id do produto buscado eh " + id);
			ps.setLong(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				produto.setNome(rs.getString("nome"));
				produto.setQtd(rs.getInt("qtd"));
				try {
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(rs.getDate("val_max"));
					produto.setVal_max(calendar);
					calendar.setTime(rs.getDate("val_min"));
					produto.setVal_min(calendar);
				} catch (SQLException e) {System.out.println("Deu pau na data do produto.");
				}
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

	public void adiciona(Produto produto) {
		connection = new Conexao().getConnection();
		//
		String sql = "insert into produto values (?, ?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setLong(1, produto.getId());
			ps.setFloat(3, produto.getValor());
			ps.setString(2, produto.getNome());
			try {
				ps.setString(4, produto.getFabricante());
			} catch (SQLException e) {
			}
			try {
				ps.setInt(5, produto.getQtd());
			} catch (SQLException e) {
			}
			try {
				ps.setDate(6, new Date(produto.getVal_max().getTimeInMillis()));
			} catch (RuntimeException e) {
				e.printStackTrace();
				ps.setNull(6, Types.DATE);
			}
			try {
				ps.setDate(7, new Date(produto.getVal_min().getTimeInMillis()));
			} catch (RuntimeException e) {
				e.printStackTrace();
				ps.setNull(7, Types.DATE);
			}
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

}