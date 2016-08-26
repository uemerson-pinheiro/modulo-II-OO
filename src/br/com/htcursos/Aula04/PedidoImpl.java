package br.com.htcursos.Aula04;

import java.util.Arrays;
import java.util.Date;

public class PedidoImpl implements Pedido {

	private Integer codigo;
	private Date data;
	private Cliente cliente;
	private ItemPedido itens[] = new ItemPedido[3];
	private int posicao = 0;

	public Integer getCodigo() {
		return codigo;
	}

	public Double calcularValorTotal() {
		double valorTotal = 0;

		for (int i = 0; i < itens.length; i++) {
			valorTotal = valorTotal + itens[i].getValor();
		}

		return valorTotal;
	}

	public void adicionarItem(ItemPedido itemPedido) {

		if (posicao < itens.length) {

			itens[posicao] = itemPedido;
			posicao++;
		}

	}

	public void removerItemPedido(ItemPedido itemPedido) {

		for (int i = 0; i < itens.length; i++) {

			if (itemPedido.equals(itens[i])) {
				Livro livro = new Livro();
				livro.setCodigo(11);
				livro.setDescricao("");
				livro.setValor(0d);
				itens[i] = livro;

			}

		}

	}

	public void imprimirItens() {
		for (int i = 0; i < itens.length; i++) {

			System.out.println(itens[i].toString());
		}
	}

	public ItemPedido[] ordenarItensPedidos() {
		Arrays.sort(itens);
		return itens;
	}

	
	public ItemPedido[] getItensPedidos() {
		
		return itens;
	}

	
	// Getters e Setters
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ItemPedido[] getItens() {
		return itens;
	}

	public void setItens(ItemPedido itens[]) {
		this.itens = itens;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
