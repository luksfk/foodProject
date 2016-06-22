package br.org.catolicasc.entity;

import java.util.ArrayList;
import java.util.List;

public class Atendente {

	private double caixa;

	private Cliente cliente;

	private boolean entrege;

	public boolean isEntrege() {
		return entrege;
	}

	public void setEntrege(boolean entrege) {
		this.entrege = entrege;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getCaixa() {
		return caixa;
	}

	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setClientes(Cliente cliente) {
		this.cliente = cliente;
	}

	public void cadastrar(Pedido pedido, Cliente cliente) {
		pedido = new Pedido();
		List<Cardapio> itens = new ArrayList<Cardapio>();
		Cardapio hamburger = new Cardapio();
		hamburger.setNome("Hamburger");
		hamburger.setPreco(5);
		itens.add(hamburger);

		Cardapio refrigerante = new Cardapio();
		refrigerante.setNome("Coca");
		refrigerante.setPreco(4);
		itens.add(refrigerante);

		pedido.setItens(itens);

	}

	public void receber(double pagamento) {
		this.setCaixa(this.getCaixa() + pagamento);
	}

	public void entregar(Cliente cliente) {
		System.out.print("Entrega efetuada");
		this.setEntrege(true);
	}

}
