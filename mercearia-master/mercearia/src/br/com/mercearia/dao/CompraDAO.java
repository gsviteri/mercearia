package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.mercearia.modelo.Compra;

public class CompraDAO {
	private Connection connection;
	

	public int adicionaC(Compra compra) {
		connection = new Conexao().getConnection();
		int retorno = 0;

		String sql = "insert into compra "
				+ "(datahora, valor, id_funcionario, id_cliente)"
				+ " values (NOW(), ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setFloat(1, compra.getValor());
			ps.setLong(2, compra.getFuncionario().getCpf());
			ps.setInt(3, compra.getCliente().getId());
			ps.execute();
			ps.close();
			connection.close();
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

	public int adiciona(Compra compra) {
		int retorno = 0;
		connection = new Conexao().getConnection();

		String sql = "insert into compra "
				+ "(datahora, valor, id_funcionario)"
				+ " values (NOW(), ?, ?)";
		
		try{
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setFloat(1, compra.getValor());
			ps.setLong(2, compra.getFuncionario().getCpf());
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
