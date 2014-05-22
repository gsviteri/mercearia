package br.com.mercearia.modelo;


import java.util.Calendar;

public class Cliente {
	private int id;
	private long doc;
	private String nome;
	private String email;
	private long telefone;
	private String sexo;
	private Calendar dataNascimento;
	public long getDoc() {
		return doc;
	}
	public void setDoc(long doc) {
		this.doc = doc;
	}
	public String getNome() {
		return nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getTelefone() {
		return telefone;
	}
	public void setTelefone(long telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
