package br.com.htcursos.ExerciciosLista14;

public interface Arquivador {

	
	public boolean procurarCaracter(char c);
	public String lerLinha();
	public void lerArquivo(String caminhoArquivo);
	public void gravar(String caminhoArquivo);
}
