package br.com.mercearia.modelo;

import java.util.Calendar;

public class Produto {
	private int id;
	private float valor;
	private String nome;
	private int qtd;
	private Calendar val_min;
	private Calendar val_max;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public Calendar getVal_min() {
		return val_min;
	}
	public void setVal_min(Calendar val_min) {
		this.val_min = val_min;
	}
	public Calendar getVal_max() {
		return val_max;
	}
	public void setVal_max(Calendar val_max) {
		this.val_max = val_max;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	
}
