package br.com.htcursos.ExerciciosLista15;

import java.util.ArrayList;
import java.util.List;



public class GerenciadorRegistroCliente extends GerenciadorRegistroGenerico<Cliente> {

	List<Cliente> clientes = new ArrayList<>();

	public List<Cliente> getListaHomens() {

		List<Cliente> cliHomem = new ArrayList<>();

		for (Cliente cliente : list) {
			if (cliente.getSexo() == 'M' || cliente.getSexo() == 'm') {
				cliHomem.add(cliente);
			}
		}
		return cliHomem;
	}

	public List<Cliente> getListaMulheres() {

		List<Cliente> cliMulher = new ArrayList<>();
		
		for (Cliente cliente : list) {
			if(cliente.getSexo()=='F' || cliente.getSexo()=='f'){
				cliMulher.add(cliente);
			}
		}
		return cliMulher;
	}

	public List<Cliente> getListaCidade(Cidade cidade) {

		List<Cliente> cliResult = new ArrayList<>();
		
			for (Cliente cliente : list) {
				
				if(cliente.getCidade().equals(cidade)){
					cliResult.add(cliente);
				}
			}
		
		return cliResult;

	}

}
