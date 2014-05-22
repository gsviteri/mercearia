package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mercearia.modelo.Pedido;
import br.com.mercearia.util.Conversao;

public class PedidoDAO {
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
	public int adiciona(Pedido pedido) {
		connection = new Conexao().getConnection();
		int retorno = 0;
		String sql = "insert into pedido (valor, comentario, fornecedor, funcionario, datahora) values (?, ?, ?, ?, ?)";
		//
		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setFloat(1, pedido.getValor());
			ps.setString(2, pedido.getDescricao());
			ps.setInt(3, pedido.getFornecedor().getId());
			ps.setLong(4, pedido.getFuncionario().getCpf());
			ps.setTimestamp(5, Conversao.timeStamp(pedido.getDataHora().getTime()));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		try{
			PreparedStatement ps = connection.prepareStatement("SELECT LAST_INSERT_ID()");
			ResultSet rs = ps.executeQuery();
			rs.next();
			retorno = rs.getInt("last_insert_id()");
			connection.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return retorno;
	}
}
