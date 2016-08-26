package br.com.htcursos.ExerciciosLista14;

public class ArquivadorImpl implements Arquivador {

	@Override
	public boolean procurarCaracter(char c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String lerLinha() {
		// TODO Auto-generated method stub
		return "Lendo linha ....";
	}

	@Override
	public void lerArquivo(String caminhoArquivo) {
		System.out.println("Lendo arquivo: "+caminhoArquivo);

	}

	@Override
	public void gravar(String caminhoArquivo) {
		System.out.println("Gravando Arquivo: "+ caminhoArquivo);

	}

}
