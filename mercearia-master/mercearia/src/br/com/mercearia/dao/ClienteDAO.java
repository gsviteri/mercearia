package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.mercearia.modelo.Cliente;

public class ClienteDAO {
	private Connection connection;

	public void adiciona(Cliente cliente) {
		connection = new Conexao().getConnection();
		//
		String sql = "insert into cliente "
				+ "(doc, nome, telefone, sexo, email, dataNascimento)"
				+ " values (?, ?, ?, ?, ?, ?)";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);

			ps.setLong(1, cliente.getDoc());
			ps.setString(2, cliente.getNome());
			ps.setLong(3, cliente.getTelefone());
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getEmail());
			ps.setDate(6, new Date(cliente.getDataNascimento()
					.getTimeInMillis()));
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Cliente> busca(String palavraChave, String parametro) {
		connection = new Conexao().getConnection();

		String sql = "select * from cliente where nome like ?";

		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			
			ps = this.connection.prepareStatement(sql);
			//ps.setString(1, parametro);
			palavraChave= ("%"+palavraChave+"%");
			ps.setString(1, palavraChave);//aqui o index eh 2...
			ResultSet rs = ps.executeQuery();
			List <Cliente> listaCliente = new ArrayList<Cliente>();
			rs.next();
			do{
			Cliente cliente = new Cliente();
			//cliente.setId(rs.getInt("id_cliente"));
			cliente.setNome(rs.getString("nome"));
			cliente.setDoc(rs.getLong("doc"));
			cliente.setTelefone(rs.getInt("telefone"));
			cliente.setSexo(rs.getString("sexo"));
			Calendar calendar = Calendar.getInstance();
			calendar.setTime(rs.getDate("dataNascimento"));
			cliente.setDataNascimento(calendar);
			cliente.setEmail(rs.getString("email"));
			listaCliente.add(cliente);
			}
			while(rs.next());
			return listaCliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
