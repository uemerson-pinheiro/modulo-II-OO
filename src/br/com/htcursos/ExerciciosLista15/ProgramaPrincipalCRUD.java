package br.com.htcursos.ExerciciosLista15;

public class ProgramaPrincipalCRUD {

	public static void main(String[] args) {
		
		
		ClienteCRUDList clienteCRUD = new ClienteCRUDList();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Joao");
		clienteCRUD.cadastro(cliente);
	
		clienteCRUD.imprimir();
	}

}
