package br.com.htcursos.Aula03;

public class Diretor extends Funcionario{

	
	public Diretor(String nome, Cidade cidade, String cpf, String rg, String cargo, Double salario) {
		super(nome, cidade, cpf, rg, cargo, salario);
		
	}

	@Override
	public double calculoSalario() {
		
		return getSalario() + (getSalario()*10/100);
	}

}
