package br.com.htcursos.ExerciciosLista14;

public class Cobranca {

	Produto[] produtos;
	Integer qtd[];
	int indice;

	public Cobranca(int i) {
		produtos = new Produto[i];
		qtd = new Integer[i];
	}

	public void adicionar(Produto produto, int i) {

		if (indice < produtos.length) {

			produtos[indice] = produto;
			qtd[indice] = i;
			indice++;

		}

	}

	public void imprimirRelatorio() {
		int qtdTotal = 0;
		double valorTotal = 0;

		for (int i = 0; i < produtos.length; i++) {
			System.out.println(produtos[i] + " Quantidade: " + qtd[i]);

			qtdTotal += qtd[i];
			valorTotal += (produtos[i].getValor() * qtd[i]);

		}
		System.out.println("Valor Total: "+valorTotal+" Qtd Total: "+qtdTotal);
	}

}
