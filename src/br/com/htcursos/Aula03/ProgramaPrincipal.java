package br.com.htcursos.Aula03;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		
		Estado mt = new Estado();
		mt.setNome("Mato Grosso");
		mt.setUf("MT");
	
		
		
		Cidade cuiaba = new Cidade();
		cuiaba.setNome("Cuiaba");
		cuiaba.setEstado(mt);
		
		SistemaCadastro cadastro = new SistemaCadastro();
		
		//Funcionario f = new Funcionario("Jão",cuiaba,"888","123","Programador",2000.00);
//		f.setNome("Jão");
//		f.setCargo("Programador");
//		f.setCidade(cuiaba);
//		f.setSalario(2000.00);
//		f.setCpf("888");
//		f.setRg("123");
//		cadastro.cadastrar(f);
	
		
		Cliente cli1 = new Cliente();
		
		cli1.setNome(JOptionPane.showInputDialog("Informe nome: "));
		cli1.setRg(JOptionPane.showInputDialog("Informe RG:"));
//		cli1.setCpf("");
//		cli1.setCidade(cuiaba);
		cadastro.cadastrar(cli1);
		
		//Cliente cli2 = new Cliente("Uemerson",cuiaba,"999","1053",32);
//		cli2.setNome("Uemerson");
//		cli2.setRg("1051");
//		cli2.setCpf("999");
//		cli2.setCidade(cuiaba);
//		cadastro.cadastrar(cli2);
		
//		System.out.println(cli1.toString());
		
		//System.out.println(cli1.equals(cli2));
		JOptionPane.showMessageDialog(null, cli1.getNome());
		
//		Fornecedor fornecedor1 = new Fornecedor();
//		fornecedor1.setCnpj("34573");
//		fornecedor1.setRazaoSocial("Nestlé");
//		fornecedor1.setNome("Pauleta");
//		cadastro.cadastrar(fornecedor1);
		
		//cadastro.imprimir();
		
	
	
		
		
		
	}

}
