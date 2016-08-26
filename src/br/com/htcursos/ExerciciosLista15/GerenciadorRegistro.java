package br.com.htcursos.ExerciciosLista15;

public interface GerenciadorRegistro <T>{
	
	public void salvar(T obj);
	public void excluir(T obj);
	public T pesquisar(T obj);
	public void imprimirTodos();

}
