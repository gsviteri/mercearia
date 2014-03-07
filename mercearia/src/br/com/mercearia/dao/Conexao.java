package br.com.mercearia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public Connection getConnection() {
		System.out.println("Pegando conexao...");
		String url = "jdbc:mysql://localhost/mercearia";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection(url, "root", "");

			System.out.println("OK");
			return conn;
			
		} catch (SQLException e) {
			// isso aqui é so uma gambiarra pq meu mysql tem senha e o seu nao
			Connection conn = null;
			try {
				conn = DriverManager.getConnection(url, "root", "root");
				if(conn != null){
					System.out.println("OK");
					return conn;
				}
			} catch (SQLException e1) {
				throw new RuntimeException(e);
			}
			
			throw new RuntimeException(e);
		} catch (ClassNotFoundException e){
			throw new RuntimeException(e);
		} 
		
	}
	
	public static void main(String[] args) {
		Conexao c = new Conexao();
		c.getConnection();
	}
}
