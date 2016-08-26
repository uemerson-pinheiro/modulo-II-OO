package br.com.htcursos.ExerciciosLista15;

import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		GerenciadorRegistroGenerico gr = new GerenciadorRegistroCliente();
		GerenciadorRegistroCliente grc = new GerenciadorRegistroCliente();

		int sair;

		do {
			System.out.println("Menu");
			System.out.println("Deseja: \n(1)Salvar \n(2)Excluir \n(3)Imprimir Homens"
					+ " \n(4)Imprimir por Mulheres \n(5)Imprimir por Cidade"
					+ " \n(6)Imprimir Busca de Cliente \n(7)Imprimir Todos");

			int opcao = leitor.nextInt();
			switch (opcao) {
			case 1:
				Cliente cliente = new Cliente();
				System.out.println("Informe Código");
				cliente.setId(Integer.parseInt(leitor.next()));
				System.out.println("Informe nome:");
				cliente.setNome(leitor.next().toUpperCase());
				System.out.println("Informe cpf:");
				cliente.setCpf(leitor.next());
				System.out.println("Informe rg:");
				cliente.setRg(leitor.next());
				System.out.println("Informe sexo:");
				cliente.setSexo(leitor.next().toUpperCase().charAt(0));
				System.out.println("Informe cidade:");
				cliente.setCidade(new Cidade(leitor.next().toUpperCase()));
				// cliente.setCidade(new Cidade(leitor.next().toUpperCase()));
				grc.salvar(cliente);

				break;

			case 2:
				Cliente clienteRemove = new Cliente();
				System.out.println("Informe Código:");
				clienteRemove.setId(leitor.nextInt());

				grc.excluir(clienteRemove);
				break;

			case 3:
				System.out.println("Lista Homens:");
				for (Cliente cliente1 : grc.getListaHomens()) {
					System.out.println(cliente1);
				}
				break;
			case 4:
				System.out.println("Lista Mulheres:");
				for (Cliente cliente1 : grc.getListaMulheres()) {
					System.out.println(cliente1);
				}
				break;
			case 5:
				System.out.println("Informe a cidade para busca dos clientes:");
				for (Cliente cliente1 : grc.getListaCidade(new Cidade(leitor.next()))) {
					System.out.println(cliente1);
				}
				break;
			case 6:
				System.out.println("Informe a Cliente para busca");
				Cliente buscaCli = new Cliente(leitor.nextInt());
//				for (Cliente cliente1 : grc.pesquisar(buscaCli)) {
//					System.out.println("");
//				}
			case 7:
				System.out.println("Impressão de todos os cadastros");
				grc.imprimirTodos();
				break;

			default:
				System.out.println("Opção invalida");
				break;

			}
			System.out.println("Deseja continuar? 1-sim  2-não");
			sair = leitor.nextInt();

		} while (sair == 1);

		leitor.close();
	}

}
