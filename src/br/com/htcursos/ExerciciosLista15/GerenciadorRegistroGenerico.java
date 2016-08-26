/**
 * 
 */
package br.com.htcursos.ExerciciosLista15;

import java.util.ArrayList;

import java.util.List;

/**
 * @author UEMERSON
 *
 */
public class GerenciadorRegistroGenerico<T> implements GerenciadorRegistro<T> {

	List<T> list = new ArrayList<>();

	@Override
	public void salvar(T obj) {
		list.add(obj);

	}

	@Override
	public void excluir(T obj) {

		if (list.contains(obj)) {
			list.remove(obj);
			System.out.println("Removido com sucesso!!");
		} else
			System.out.println("Codigo inexistente");
	}

	@Override
	public T pesquisar(T obj) {

		if (list.indexOf(obj) == -1) {

			return null;
		}

		else {

			T pesquisa = list.get(list.indexOf(obj));
			return pesquisa;
		}

	}

	@Override
	public void imprimirTodos() {

		for (T t : list) {
			System.out.println(t);
		}

	}

}
