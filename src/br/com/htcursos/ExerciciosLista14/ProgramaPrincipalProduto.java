package br.com.htcursos.ExerciciosLista14;

public class ProgramaPrincipalProduto {

	public static void main(String[] args) {
		
		Produto almoco = new Refeicao(TipoProdutoEnum.ALMOCO, 12.d);
		Produto marmita = new Refeicao(TipoProdutoEnum.MARMITA, 10.D);
		Produto	suco = new Bebida(TipoProdutoEnum.SUCO, 5.d);
		Produto refrigerante = new Bebida(TipoProdutoEnum.REFRIGERANTE, 6.d);
		
		Produto almocoPromocional = new Produto() {
			public double getValor(){
				return 8.0;
			}

			@Override
			public TipoProdutoEnum getTipo() {
				// TODO Auto-generated method stub
				return TipoProdutoEnum.ALMOCO;
			}
			public String toString(){
				return getTipo() + " Valor:"+ getValor();
			}
		};
		
		
		
		Cobranca cobranca = new  Cobranca(5);
		cobranca.adicionar(almoco,1);
		cobranca.adicionar(marmita, 2);
		cobranca.adicionar(suco, 1);
		cobranca.adicionar(refrigerante, 1);
		cobranca.adicionar(almocoPromocional, 2);
		
		cobranca.imprimirRelatorio();
	}

}
