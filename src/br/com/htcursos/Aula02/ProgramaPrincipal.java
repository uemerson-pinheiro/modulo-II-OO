package br.com.htcursos.Aula02;


public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Estado mt = new Estado();
		mt.setNome("Mato Grosso");
		mt.setUf("MT");
	
		
		
		Cidade cuiaba = new Cidade();
		cuiaba.setNome("Cuiaba");
		cuiaba.setEstado(mt);
		
		SistemaCadastro cadastro = new SistemaCadastro();
		
//		Funcionario f = new Funcionario();
//		f.setNome("Jão");
//		f.setCargo("Programador");
//		f.setCidade(cuiaba);
//		f.setSalario("2000");
//		f.setCpf("888");
//		f.setRg("123");
//		cadastro.cadastrar(f);
	
		
		Cliente cli1 = new Cliente("Uemerson",cuiaba,"999","1053",32);
//		cli1.setNome("Uemerson");
//		cli1.setRg("1053");
//		cli1.setCpf("999");
//		cli1.setCidade(cuiaba);
//		cadastro.cadastrar(cli1);
		
		Cliente cli2 = new Cliente("Uemerson",cuiaba,"999","1053",32);
//		cli2.setNome("Uemerson");
//		cli2.setRg("1051");
//		cli2.setCpf("999");
//		cli2.setCidade(cuiaba);
//		cadastro.cadastrar(cli2);
		
//		System.out.println(cli1.toString());
		
		System.out.println(cli1.equals(cli2));
		System.out.println(cli1.getQuantidadeCliente());
		
//		Fornecedor fornecedor1 = new Fornecedor();
//		fornecedor1.setCnpj("34573");
//		fornecedor1.setRazaoSocial("Nestlé");
//		fornecedor1.setNome("Pauleta");
//		cadastro.cadastrar(fornecedor1);
		
		//cadastro.imprimir();
		
	
		
		
		
		
	}

}
