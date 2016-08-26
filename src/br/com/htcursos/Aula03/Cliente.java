package br.com.htcursos.Aula03;

public class Cliente extends PessoaFisica{

	public int idade;
	private static int quantidadeCliente = 0;
	
	public Cliente(){
		
		quantidadeCliente++;
	}
	public static int getQuantidadeCliente(){
		
		return quantidadeCliente;
	}
	
	
	public Cliente(String nome, Cidade cidade, String cpf, String rg, int idade) {
		super(nome, cidade, cpf, rg);
		this.idade = idade;
	}



	@Override
	public String toString() {
		return "Cliente: Cpf =" + getCpf() + ",Rg= " + getRg() + ",Nome= " + getNome() + ",Cidade "
				+ getCidade();
	}

		
	
}
