package br.com.htcursos.ExerciciosLista15;

import java.util.ArrayList;
import java.util.List;

public class ClienteCRUDList<Cliente> implements Crud<Cliente> {
	
	List<Cliente> clientes = new ArrayList<>();
	

	
	
	@Override
	public void cadastro(Object o) {
		clientes.add((Cliente) o);
		
	}

	@Override
	public void excluir(Object o) {
		clientes.remove(o);
		
	}

	@Override
	public void alterar(Object o) {
		clientes.add((Cliente) o);
		
	}

	@Override
	public Cliente[] buscarTodos() {
		
				
	return null;
	}
	
	public void imprimir(){
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
