package br.com.htcursos.Aula03;

public abstract class Funcionario extends PessoaFisica {

	private String cargo;
	private Double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, Cidade cidade, String cpf, String rg, String cargo, Double salario) {
		super(nome, cidade, cpf, rg);
		this.cargo = cargo;
		this.salario = salario;
	}

	public abstract double calculoSalario();

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", salario=" + salario + "]";
	}

	
	

}
