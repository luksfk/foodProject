package br.org.catolicasc.entity;

public class Cliente {

	private double carteira;

	public double getCarteira() {
		return carteira;
	}

	public void setCarteira(double carteira) {
		this.carteira = carteira;
	}

	public void fazerPedido() {
		System.out.println("Solicitando pedido...");
	}

	public void pagar(double precoPedido) {
		this.setCarteira(this.getCarteira() - precoPedido);
	}

}
