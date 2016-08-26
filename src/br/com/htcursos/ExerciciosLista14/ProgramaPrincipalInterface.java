package br.com.htcursos.ExerciciosLista14;



//Não entendi o que o exercicio pediu.
public class ProgramaPrincipalInterface {

	public static void main(String[] args) {

		Arquivador arq1 = new Arquivador() {

			@Override
			public boolean procurarCaracter(char c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String lerLinha() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public void lerArquivo(String caminhoArquivo) {
				// TODO Auto-generated method stub

			}

			@Override
			public void gravar(String caminhoArquivo) {
				// TODO Auto-generated method stub

			}
		};
		
		Arquivador arq2 = new ArquivadorImpl();
		arq2.procurarCaracter('c');
		arq2.lerArquivo("x.doc");
		arq2.lerLinha();
		arq2.gravar("x.doc");
		
		
		arq2.procurarCaracter('c');
		arq2.lerLinha();
		

	}

}
