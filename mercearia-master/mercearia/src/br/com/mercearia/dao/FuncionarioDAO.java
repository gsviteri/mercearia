package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mercearia.modelo.Funcionario;

public class FuncionarioDAO {
	String sql;
	PreparedStatement ps;
	private Connection connection;

	public void adiciona(Funcionario funcionario) { 
		connection = new Conexao().getConnection();

		sql = "insert into funcionario "
				+ "(cpf, nome, usuario, senha, email, telefone, dataNascimento)"
				+ " values (?, ?, ?, ?, ?, ?, ?)";

		try {
			ps = connection.prepareStatement(sql);

			ps.setLong(1, funcionario.getCpf());
			ps.setString(2, funcionario.getNome());
			ps.setString(3, funcionario.getUsuario());
			ps.setString(4, funcionario.getSenha());
			try{
				ps.setLong(6, funcionario.getTelefone());
			}catch(RuntimeException e){}
			try{
				ps.setLong(5, funcionario.getTelefone());
			}catch(RuntimeException e){}
			
			ps.setDate(7, new Date(funcionario.getDataNascimento()
					.getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public boolean checaLogin(String usuario, String senha) {
		connection = new Conexao().getConnection();

		sql = "select * from funcionario" + " where usuario=? and senha=?";

		try {
			ps = this.connection.prepareStatement(sql);
			ps.setString(1, usuario);
			ps.setString(2, senha);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("True");
				ps.close();
				connection.close();
				return true;
			}
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		System.out.println("false");

		return false;
	}

	public List<Funcionario> getLista() {
		connection = new Conexao().getConnection();
		sql = "select * from funcionario";
		List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
		try {
			ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Funcionario funcionario = new Funcionario();
				funcionario.setCpf(rs.getLong("cpf"));
				try {
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(rs.getDate("dataNascimento"));
					funcionario.setDataNascimento(calendar);
				} catch (SQLException e) {
				}
				funcionario.setNome(rs.getString("nome"));
				funcionario.setUsuario(rs.getString("usuario"));
				try {
					funcionario.setTelefone(rs.getLong("telefone"));
				} catch (SQLException e) {
				}
				listaFuncionario.add(funcionario);
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		return listaFuncionario;
	}

	public Funcionario busca(String usuario) {
		connection = new Conexao().getConnection();
		sql = "select * from funcionario where usuario = ?";
		Funcionario funcionario = new Funcionario();
		System.out.println("DAO: " + usuario);
		try {
			ps = this.connection.prepareStatement(sql);
			ps.setString(1, usuario);
			ResultSet rs = ps.executeQuery();
			rs.next();
			funcionario.setCpf(rs.getLong("cpf"));
			try {
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(rs.getDate("dataNascimento"));
				funcionario.setDataNascimento(calendar);
			} catch (SQLException e) {
				System.out.println("Erro na busca da data.");
			}
			funcionario.setNome(rs.getString("nome"));
			System.out.println(funcionario.getCpf());
			funcionario.setUsuario(rs.getString("usuario"));
			try {
				funcionario.setTelefone(rs.getLong("telefone"));
			} catch (SQLException e) {
			}
			return funcionario;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}
}