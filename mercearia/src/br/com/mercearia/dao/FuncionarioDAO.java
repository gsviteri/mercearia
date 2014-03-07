package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.com.mercearia.modelo.Cliente;


public class FuncionarioDAO {
	String sql;
	PreparedStatement ps;
	private Connection connection;
	
	
	public void adiciona(Cliente cliente){	
		connection = new Conexao().getConnection();

		sql = "insert into cliente " +
				"(cpf, nome, telefone, sexo, dataNascimento)" +
				" values (?, ?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(sql);
			
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
	public boolean checaLogin(String usuario, String senha){
		connection = new Conexao().getConnection();
		
		sql = "select * from funcionario" +
				" where nome=? and senha=?";
		
			try { 
				ps = this.connection.prepareStatement(sql);
				ps.setString(1, usuario);
				ps.setString(2, senha);
				System.out.println(sql);
				System.out.println(senha);
				ResultSet rs = ps.executeQuery();
				if (rs.last() || rs.next()){
					System.out.println("True");
					return true;					
				}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
			System.out.println("false");
		return false;
		}
}