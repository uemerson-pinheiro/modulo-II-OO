package br.com.htcursos.ExerciciosLista14;

public class Refeicao implements Produto {

	private Double valor;
	private TipoProdutoEnum tipo;

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void setTipo(TipoProdutoEnum tipo) {
		this.tipo = tipo;
	}

	public Refeicao(TipoProdutoEnum tipo, double valor) {

		this.valor = valor;
		this.tipo = tipo;
	}

	@Override
	public double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public TipoProdutoEnum getTipo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public String toString() {
		return tipo + " valor=" + valor;
	}

}
