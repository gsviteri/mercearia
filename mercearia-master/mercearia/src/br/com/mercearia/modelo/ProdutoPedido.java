package br.com.mercearia.modelo;

public class ProdutoPedido {
	private Produto produto;
	private Pedido pedido;
	private int qtd;
	private float valor;
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float f) {
		this.valor = f;
	}
	
}
