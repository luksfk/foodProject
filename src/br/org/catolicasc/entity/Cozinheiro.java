package br.org.catolicasc.entity;

public class Cozinheiro {

	public void receberPedido(Pedido pedido) {
		System.out.println("Pedido recebido");
	}

	public void montarPedido(Pedido pedido) {
		System.out.println("Pedido montado");
		pedido.setEntregue(true);
	}

}
