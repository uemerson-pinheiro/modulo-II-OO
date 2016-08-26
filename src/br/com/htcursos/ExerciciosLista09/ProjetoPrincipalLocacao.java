package br.com.htcursos.ExerciciosLista09;


import java.time.LocalDate;

public class ProjetoPrincipalLocacao {

	public static void main(String[] args) {

		
		// Instanciando Genero

		Genero terror = new Genero();
		terror.setDescricao("Terror");
		Genero suspense = new Genero();
		suspense.setDescricao("Suspense");
		Genero acao = new Genero();
		acao.setDescricao("Ação");

		// Instanciando Autores
		
		Autor autor01 = new Autor();
		autor01.setNome("Paulo Salles");
		Autor autor02 = new Autor();
		autor02.setNome("James Phill");
		Autor autor03 = new Autor();
		autor03.setNome("Paula Mendes");
		
		// Instanciando Atendente
		
		Atendente atendente = new Atendente();
		atendente.setNome("Roberto");
		atendente.setCpf("9999");
		
		// Instanciando Filmes
		
		Filme filme01 = new Filme();
		filme01.setNome("Casa de Cera");
		filme01.setGenero(terror);
		filme01.setAutor(autor01);
		
		Filme filme02 = new Filme();
		filme02.setNome("Morgana");
		filme02.setGenero(suspense);
		filme02.setAutor(autor03);
		
		Filme filme03 = new Filme();
		filme03.setNome("Kill Bill");
		filme03.setGenero(acao);
		filme03.setAutor(autor02);
		
		
		// Instanciando Cliente
		
		Cliente cliente01 = new Cliente();
		cliente01.setNome("Uemerson Pinheiro");
		cliente01.setCpf("999.999.999-00");
		
		Cliente cliente02 =new Cliente();
		cliente02.setNome("Maria");
		cliente02.setCpf("888.888.888-11");
		
		Cliente cliente03 =new Cliente();
		cliente03.setNome("Jorge");
		cliente03.setCpf("777.777.777-11");
		
		
		// Instanciar Locação
		
		Locacao locacao01 = new Locacao();
		
		LocalDate dataLocacao = LocalDate.now();	
		LocalDate dataEntrega = dataLocacao.plusDays(5);// somando 5 dias de entrega após a locação.
		
		System.out.println(dataLocacao);
		System.out.println(dataEntrega);
		
		locacao01.setCliente(cliente01);
		locacao01.setFilme(filme02);
		locacao01.setAtendente(atendente);
		
		
		
		Locacao locacao02 = new Locacao();
		locacao02.setCliente(cliente02);
		locacao02.setFilme(filme03);
		locacao02.setAtendente(atendente);
		
		
		
		Locacao locacao03 =new Locacao();
		locacao03.setCliente(cliente03);
		locacao03.setFilme(filme01);
		locacao03.setAtendente(atendente);
		
		
		
		
		
		System.out.println("Informação sobre as locações");
		System.out.println("Locação 01:");
		System.out.println("Cliente: "+locacao01.getCliente().getNome()+" locou o filme "+locacao01.getFilme().getNome()
				+" do Autor "+locacao01.getFilme().getAutor().getNome()+" de genero "+locacao01.getFilme().getGenero().getDescricao());
		System.out.println("Data da locação: "+dataLocacao+"/Dta Entrega: "+dataEntrega);
		
		System.out.println("##############");
		System.out.println("Informação sobre as locações");
		System.out.println("Locação 02:");
		System.out.println("Cliente: "+locacao02.getCliente().getNome()+" locou o filme "+locacao02.getFilme().getNome()
				+" do Autor "+locacao02.getFilme().getAutor().getNome()+" de genero "+locacao02.getFilme().getGenero().getDescricao());
		System.out.println("Data da locação: "+dataLocacao+"/Dta Entrega: "+dataEntrega);
		
		System.out.println("##############");
		System.out.println("Informação sobre as locações");
		System.out.println("Locação 03:");
		System.out.println("Cliente: "+locacao03.getCliente().getNome()+" locou o filme "+locacao03.getFilme().getNome()
				+" do Autor "+locacao03.getFilme().getAutor().getNome()+" de genero "+locacao03.getFilme().getGenero().getDescricao());
		System.out.println("Data da locação: "+dataLocacao+"/Dta Entrega: "+dataEntrega);
	}

}
