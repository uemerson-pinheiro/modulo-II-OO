package br.com.htcursos.aula01;



public class ProjetoPrincipal {

	public static void main(String[] args) {
		

		// Construção do objeto Estado
		Estado ms = new Estado();
		ms.setNome("Mato Grosso do Sul");
		ms.setUf("MS");
		
		System.out.println(ms.toString());
		
		// Construção do objeto Cidade
		Cidade cg = new Cidade();
		cg.setNome("Campo Grande");
		cg.setEstado(ms);
		
		Cidade pp = new Cidade();
		pp.setNome("Ponta Porã");
		pp.setEstado(ms);
			
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Uemerson");
		cliente.setSobrenome("Pinheiro");
		// Relacionamento do objeto cliente com objeto cidade
		cliente.setCidade(cg);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Maria");
		cliente2.setSobrenome("Madalena");
		cliente2.setCidade(pp);
		
//		System.out.println("Dados de \n"+cliente.getNome()+" "+cliente.getSobrenome()+": " +cliente.getCidade().getNome()+"/"+cliente.getCidade().getEstado().getNome()+
//								"/"+cliente.getCidade().getEstado().getUf());
//		
//		System.out.println("//////////////////////////");
//		
//		System.out.println("Dados de \n"+cliente2.getNome()+" "+cliente2.getSobrenome()+": " +cliente2.getCidade().getNome()+"/"+cliente2.getCidade().getEstado().getNome()+
//				"/"+cliente2.getCidade().getEstado().getUf());
//		
	}

}
