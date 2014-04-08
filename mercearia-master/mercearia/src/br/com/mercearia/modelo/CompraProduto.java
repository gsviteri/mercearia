package br.com.mercearia.modelo;

public class CompraProduto {
	
	private Compra compra;
	private float valor;
	private int qtd;
	private Produto produto;
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Compra getCompra() {
		return compra;
	}
	public void setCompra(Compra compra) {
		this.compra = compra;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float f) {
		this.valor = f;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	

}
