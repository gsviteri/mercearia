package br.com.mercearia.modelo;

import java.util.Calendar;

public class Pedido {
	private int id;
	private float valor;
	private String descricao;
	private Fornecedor fornecedor;
	private Calendar dataHora;
	private Funcionario funcionario;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float  getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	public Calendar getDataHora() {
		return dataHora;
	}
	public void setDataHora(Calendar dataHora) {
		this.dataHora = dataHora;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

 
}
