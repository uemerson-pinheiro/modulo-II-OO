package br.com.htcursos.Aula06;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ProgramaPrincipalMap {

	public static void main(String[] args) {
		
		Map<String, String> linguagemProgramacao = new HashMap<String, String>();
//		linguagemProgramacao.put("Java", "Web, Movel e Desktop");
//		linguagemProgramacao.put("PHP", "Web");
//		linguagemProgramacao.put("Java Script", "Web navegador Web");
//		
//		//Imprimindo por meio da chave
//		//System.out.println(linguagemProgramacao.get("Java"));
//		
//		//Imprimindo por meio de uma set de chaves
		Set<String> key = linguagemProgramacao.keySet();
		
		
		for (String k : key) {
			System.out.println(linguagemProgramacao.get(k));
		}
		
//		// Substituição direto na chave já existente
//		linguagemProgramacao.replace("PHP", "TESTE");
//	
//		
//		System.out.println("##########");
//		for (String k : key) {
//			
//			System.out.println(linguagemProgramacao.get(k));
//		}

		// #####################################
		
		Map<Cliente, Cliente> casal = new HashMap<>();
		
		Cliente c1 = new Cliente("Maria");
		Cliente c2 = new Cliente("Joao");
		
		casal.put(c1, c2);
		System.out.println("Esposo da "+c1.getNome()+" é "+casal.get(c1));
		
		
	}

}
