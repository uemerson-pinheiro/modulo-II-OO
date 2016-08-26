package br.com.htcursos.ExerciciosLista15;

public interface Crud<T> {
	
	public void cadastro(T o);
	public void excluir(T o);
	public void alterar(T o);
	public T[] buscarTodos();
}
