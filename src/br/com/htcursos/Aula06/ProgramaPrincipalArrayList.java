package br.com.htcursos.Aula06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ProgramaPrincipalArrayList {

	public static void main(String[] args) {
		
  //Trabalho com List		
//		List<Cliente> clientes = new ArrayList<>();
//		
//		clientes.add(new Cliente("Jão"));
//		clientes.add(new Cliente("Maria"));
//		clientes.add(new Cliente("Maria"));
//		clientes.add(new Cliente("Pedro"));
//		
//		// Forma de imprimir 1 
//		for (int i = 0; i < clientes.size(); i++) {
//			System.out.println(clientes.get(i));			
//		}
//		//// Forma de imprimir 2
//		
//		clientes.remove(2);
//		System.out.println("######");
//		for (Iterator<Cliente> iterator = clientes.iterator(); iterator.hasNext();) {
//			Cliente cliente = (Cliente) iterator.next();
//			System.out.println(cliente);
//		}
//		// Forma de imprimir 3
//		
//		System.out.println("#######");
//		for (Cliente cliente : clientes) {
//			System.out.println(cliente);
//		}
//		
		
		// Trabalhando com SET
		
		Set<Cliente> cliente = new HashSet<>();
		
		Cliente c1 = new Cliente();
		c1.setNome("Maria");
		
		Cliente c2 = new Cliente();
		c2.setNome("Maria");
		Cliente c3 = new Cliente();
		c3.setNome("Joao");
		
		cliente.add(c1);
		cliente.add(c2);
		cliente.add(c3);
		
		// Essa incrementação e para acessar os cliente por
		// posição, não se consegue acesso como vetor exemplo
		// utilizando for(int i=0;i<cliente.size();i++) ; impossivel!!!!
		Iterator<Cliente> iterador = cliente.iterator();
		
		while(iterador.hasNext()){
			Cliente c=iterador.next();
			System.out.println(c);
		}
			
		
//		nomes.add("Maria");
//		nomes.add("Pedro");
//		nomes.add("Jose");
//		nomes.add("Maria");
		
			
//		for (String string : nomes) {
//			System.out.println(string);
//			
//		}
//		
//		boolean contem = nomes.contains("Maria");
//		System.out.println("Contem nome Maria?"+contem);
//		
//		nomes.remove("Maria");
//		
//		for ( String string : nomes) {
//			System.out.println(string);
//		}
		
	}

}
