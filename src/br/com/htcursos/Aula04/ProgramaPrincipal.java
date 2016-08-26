package br.com.htcursos.Aula04;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Pedido pedido = new PedidoImpl();
		
		int codigoItem = 1;
		
		ItemPedido livro = new Livro();
		livro.setCodigo(codigoItem);
		livro.setValor(120.50);
		livro.setDescricao("Livro de Java");
		
		ItemPedido curso1 = new Curso();
		curso1.setCodigo(++codigoItem);
		curso1.setValor(240d);
		curso1.setDescricao("Desenvolvimento para Android");
		
		ItemPedido curso2 = new Curso();
		curso2.setCodigo(++codigoItem);
		curso2.setValor(150d);
		curso2.setDescricao("Fábrica de Programador");
		
		pedido.adicionarItem(livro);
		pedido.adicionarItem(curso1);
		pedido.adicionarItem(curso2);
		
		pedido.imprimirItens();
		
		double total = pedido.calcularValorTotal();
		System.out.println(total);
		
		pedido.removerItemPedido(curso1);
		
		//Removendo ItemPedido Curso 1
		//pedido.imprimirItens();
		
		double novoTotal = pedido.calcularValorTotal();
		System.out.println(novoTotal);
		
		pedido.ordenarItensPedidos();
		
		pedido.imprimirItens();

	}

	
	
	
}
