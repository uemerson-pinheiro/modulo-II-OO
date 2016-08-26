package br.com.htcursos.ExerciciosLista09;

public class ProjetoPrincipalConta {

	public static void main(String[] args) {
		// Instaciando Estado
		Estado estado01 = new Estado();
		estado01.setNome("Mato Grosso do Sul");
		estado01.setUf("MS");
		
		Estado estado02 = new Estado();
		estado02.setNome("São Paulo");
		estado02.setUf("SP");
		
		Estado estado03 = new Estado();
		estado03.setNome("Paraná");
		estado03.setUf("PR");

		// Instanciando Cidade

		Cidade cidade01 = new Cidade();
		cidade01.setNome("Campo Grande");
		cidade01.setEstado(estado01);
		
		Cidade cidade02 = new Cidade();
		cidade02.setNome("Campinas");
		cidade02.setEstado(estado02);
		
		Cidade cidade03 = new Cidade();
		cidade03.setNome("Curitiba");
		cidade03.setEstado(estado03);

		// Instanciando Logradouro
		Logradouro logradouro01 = new Logradouro();
		logradouro01.setRua("Afonso Pena");
		logradouro01.setBairro("Centro");
		logradouro01.setCep("79000000");
		logradouro01.setCidade(cidade01);
		
		Logradouro logradouro02 = new Logradouro();
		logradouro02.setRua("Mato Grosso");
		logradouro02.setBairro("Centro");
		logradouro02.setCep("78000000");
		logradouro02.setCidade(cidade02);
		
		Logradouro logradouro03 = new Logradouro();
		logradouro03.setRua("Bahia");
		logradouro03.setBairro("Centro");
		logradouro03.setCep("890000000");
		logradouro03.setCidade(cidade03);

		// Instanciando Banco
		Banco banco01 = new Banco();
		banco01.setNome("HSBC");
		banco01.setCodigo(100);
		
		Banco banco02 = new Banco();
		banco02.setNome("Banco do Brasil");
		banco02.setCodigo(200);
		
		Banco banco03 = new Banco();
		banco03.setNome("Bradesco");
		banco03.setCodigo(300);
		
		// Instanciando Agencia
		Agencia agencia01 = new Agencia();
		agencia01.setNome("Shopping");
		agencia01.setCodigo(9709);
		agencia01.setLogradouro(logradouro01);
		agencia01.setNumero(2710);
		agencia01.setBanco(banco01);
		
		Agencia agencia02= new Agencia();
		agencia02.setNome("Shopping Iguatemi");
		agencia02.setCodigo(23456);
		agencia02.setLogradouro(logradouro02);
		agencia02.setNumero(2);
		agencia02.setBanco(banco02);
		
		Agencia agencia03= new Agencia();
		agencia03.setNome("Centro");
		agencia03.setCodigo(9999);
		agencia03.setLogradouro(logradouro03);
		agencia03.setNumero(22222);
		agencia03.setBanco(banco03);
		
		// Instanciando Correntista
		Correntista correntista01 = new Correntista();
		correntista01.setNome("Uemerson Pinheiro");
		correntista01.setCpf("999.999.999-00");
		correntista01.setCodigo(99);
		
		Correntista correntista02 = new Correntista();
		correntista02.setNome("Uemerson Pinheiro");
		correntista02.setCpf("999.999.999-00");
		correntista02.setCodigo(88);
		
		Correntista correntista03 = new Correntista();
		correntista03.setNome("Uemerson Pinheiro");
		correntista03.setCpf("999.999.999-00");
		correntista03.setCodigo(77);
		
		// Instanciando Conta
		Conta conta01 = new Conta();
		conta01.setNumero(47474747);
		conta01.setAgencia(agencia01);
		conta01.setCorrentista(correntista01);
		
		Conta conta02 = new Conta();
		conta02.setNumero(47474747);
		conta02.setAgencia(agencia02);
		conta02.setCorrentista(correntista02);
		
		Conta conta03 = new Conta();
		conta03.setNumero(47474747);
		conta03.setAgencia(agencia03);
		conta03.setCorrentista(correntista03);
		
		
		
		System.out.println("Os dados do Correntista: "+conta01.getCorrentista().getNome());
		System.out.println("Banco: "+conta01.getAgencia().getBanco().getNome());
		System.out.println("Agencia: "+conta01.getAgencia().getNome());
		System.out.println("Endereço: Rua "+conta01.getAgencia().getLogradouro().getRua()+"\n"
				+"Bairro: "+conta01.getAgencia().getLogradouro().getBairro()+"\n"
				+"Cidade: "+conta01.getAgencia().getLogradouro().getCidade().getNome()+"\n"
				+"Estado: "+conta01.getAgencia().getLogradouro().getCidade().getEstado().getNome()+"/"
				+conta01.getAgencia().getLogradouro().getCidade().getEstado().getUf());
		System.out.println("Conta: "+conta01.getNumero());
		
		System.out.println("########################");
		System.out.println("Os dados do Correntista: "+conta02.getCorrentista().getNome());
		System.out.println("Banco: "+conta02.getAgencia().getBanco().getNome());
		System.out.println("Agencia: "+conta02.getAgencia().getNome());
		System.out.println("Endereço: Rua "+conta02.getAgencia().getLogradouro().getRua()+"\n"
				+"Bairro: "+conta02.getAgencia().getLogradouro().getBairro()+"\n"
				+"Cidade: "+conta02.getAgencia().getLogradouro().getCidade().getNome()+"\n"
				+"Estado: "+conta02.getAgencia().getLogradouro().getCidade().getEstado().getNome()+"/"
				+conta02.getAgencia().getLogradouro().getCidade().getEstado().getUf());
		System.out.println("Conta: "+conta02.getNumero());
		System.out.println("########################");
		System.out.println("Os dados do Correntista: "+conta03.getCorrentista().getNome());
		System.out.println("Banco: "+conta03.getAgencia().getBanco().getNome());
		System.out.println("Agencia: "+conta03.getAgencia().getNome());
		System.out.println("Endereço: Rua "+conta03.getAgencia().getLogradouro().getRua()+"\n"
				+"Bairro: "+conta03.getAgencia().getLogradouro().getBairro()+"\n"
				+"Cidade: "+conta03.getAgencia().getLogradouro().getCidade().getNome()+"\n"
				+"Estado: "+conta03.getAgencia().getLogradouro().getCidade().getEstado().getNome()+"/"
				+conta03.getAgencia().getLogradouro().getCidade().getEstado().getUf());
		System.out.println("Conta: "+conta03.getNumero());
		

	}

}
