package br.com.htcursos.Aula02;

public class Funcionario extends PessoaFisica{

	 private String cargo;
	 private String salario;

	 
	 
	public Funcionario(String nome, Cidade cidade, String cpf, String rg, String cargo, String salario) {
		super(nome, cidade, cpf, rg);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", Nome=" + getNome() + ", Cidade=" + getCidade()+ "]";
	}

	



}
