package br.org.catolicasc.entity;

import java.util.List;

public class Pedido {

	private List<Cardapio> itens;

	boolean entregue;

	public boolean isEntregue() {
		return entregue;
	}

	public void setEntregue(boolean entregue) {
		this.entregue = entregue;
	}

	public List<Cardapio> getItens() {
		return itens;
	}

	public void setItens(List<Cardapio> itens) {
		this.itens = itens;
	}

}
