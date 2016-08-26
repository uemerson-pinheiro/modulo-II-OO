package br.com.htcursos.ExerciciosLista12;

public class Cliente {

	private String nome;
	private String cpf;
	private String rg;
	private Cidade cidade;
	
	public Cliente() {
		
	}
	
	
	public Cliente(String nome, String cpf, String rg, Cidade cidade) {
		this.nome=nome;
		this.cpf=cpf;
		this.rg=rg;
		this.cidade=cidade;
	}


	public Cliente(String nome, Cidade cidade) {
		this.nome=nome;
		this.cidade=cidade;

	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	@Override
	public String toString() {
		return "Cliente: nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + cidade;
	}
	
	
}
