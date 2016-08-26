package br.com.htcursos.Aula03;

public class SistemaCadastro {

	Pessoa pessoas[] = new Pessoa[3];
	int numEntrada = 0;

	/**
	 * Entrada Generica
	 * 
	 * @param pessoa
	 */

	public void cadastrar(Pessoa pessoa) {

		if (numEntrada < pessoas.length) {

			pessoas[numEntrada] = pessoa;
			numEntrada++;
		}
	}

	/**
	 * Impressão de forma especifica
	 */
	public void imprimir() {

		for (int i = 0; i < pessoas.length; i++) {

			if (pessoas[i] instanceof PessoaJuridica) {

				PessoaJuridica pj = (PessoaJuridica) pessoas[i];

				System.out.println("## Pessoas Juridicas ##");
				System.out.println("# Fornecedores #");
				System.out.println("Nome: " + pessoas[i].getNome());
				System.out.println("CNPJ: "+pj.getCnpj() + "/ Razão: " + pj.getRazaoSocial());

			}

			else if (pessoas[i] instanceof PessoaFisica) {

				PessoaFisica pf = (PessoaFisica) pessoas[i];

				System.out.println("## Pessoas Físicas ##");

				if (pessoas[i] instanceof Funcionario) {

					Funcionario func = (Funcionario) pessoas[i];

					System.out.println("# Funcionarios #");
					System.out.println("Nome: "+pessoas[i].getNome());
					System.out.println("CPF: "+pf.getCpf() + "/RG: " + pf.getRg());
					System.out.println( "Salário: "+func.getSalario() + "/ Cargo: " + func.getCargo());
				}

				else if (pessoas[i] instanceof Cliente) {
					
					
					System.out.println("# Cliente #");
					System.out.println("Nome: "+pessoas[i].getNome());
					System.out.println("CPF: "+pf.getCpf() + "/ RG: " + pf.getRg());
				}

			}

		}

	}

}
