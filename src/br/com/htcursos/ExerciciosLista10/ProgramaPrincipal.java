package br.com.htcursos.ExerciciosLista10;

import java.util.Date;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		// Internamente ja cria um vetor de 3 posições pois ja existe em
		// Gerenciados de Matricula
		System.out.println("Informe quantidade de matriculas");
		int qtd = leitor.nextInt();

		GerenciadorMatricula gm = new GerenciadorMatricula();
		gm.setQtdMatriculas(qtd);

		for (int i = 0; i < gm.getQtdMatriculas(); i++) {
			Curso c = new Curso();
			System.out.println("Nome do Curso");
			c.setNome(leitor.next());
			System.out.println("Carga Horária");
			c.setCargaHoraria(leitor.nextInt());

			Aluno a = new Aluno();
			System.out.println("Informe Codigo");
			a.setCodigo(leitor.nextInt());
			System.out.println("Nome");
			a.setNome(leitor.next());

			Matricula m = new Matricula();
			m.setAluno(a);
			//m.setCurso(c);
			m.setData(new Date());

			gm.cadastrar(m);
		}

		// Busca
		System.out.println("Deseja busca por aluno (1) ou Curso(2)");
		int opcao = leitor.nextInt();
		Matricula[] buscaMatricula = null;
		if (opcao == 1) {

			System.out.println("Informe um codigo para busca do aluno");
			Aluno alunoBusca = new Aluno();
			alunoBusca.setCodigo(leitor.nextInt());

			buscaMatricula = gm.buscarMatriculas(alunoBusca);
		} else if (opcao == 2) {

			System.out.println("Informe um nome para busca do Curso");
			Curso cursoBusca = new Curso();
			cursoBusca.setNome(leitor.next());
			buscaMatricula = gm.buscarMatriculas(cursoBusca);

		}

		for (int i = 0; i < buscaMatricula.length; i++) {

			if (buscaMatricula[i] == null)
				break;

			System.out.println("Aluno: " + buscaMatricula[i].getAluno().getNome() + "Cod Mat: "
					+ buscaMatricula[i].getCodigo() + "Curso: " + buscaMatricula[i].getCurso().getNome());

		}

		leitor.close();
	}

}
