package br.com.htcursos.ExerciciosLista14;

public class Bebida implements Produto {

	private TipoProdutoEnum tipo;
	private Double valor;

	public Bebida() {

	}

	public void setTipo(TipoProdutoEnum tipo) {
		this.tipo = tipo;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Bebida(TipoProdutoEnum tipo, double valor) {
		this.tipo = tipo;
		this.valor = valor;
	}

	@Override
	public double getValor() {

		return valor;
	}

	@Override
	public TipoProdutoEnum getTipo() {

		return tipo;
	}

	@Override
	public String toString() {
		return  tipo + " valor=" + valor;
	}

	
}
