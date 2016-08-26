package br.com.htcursos.ExerciciosLista12;

import java.util.Date;

import br.com.htcursos.Aula04.Curso;
import br.com.htcursos.ExerciciosLista10.Aluno;
import br.com.htcursos.ExerciciosLista10.Matricula;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Calculadora cal = new Calculadora();
		
		System.out.println(cal.soma(10,25));
		
		System.out.println(cal.soma(10.6,25.6,3.6));
		
		System.out.println(new Cidade("Campo Grande", new Estado("Mato Grosso do Sul","MS")));
		
		Cliente cliente1 = new Cliente("Edson Silva de Souza","904.567.973-88","0009264-86 SSP/MS",
				new Cidade("Campo Grande", new Estado("Mato Gosso do Sul","MS")));
		
		Cliente cliente2 = new Cliente("Zé Bento dos Santos", new Cidade("Campo Grande", new Estado("Mato Grosso do Sul", "MS")));
		
		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		
		
		Matricula matricula = new Matricula(new Aluno("Jão da Silva"), new Curso("Fabrica"), new Date());

		System.out.println(matricula.toString());
	}

}
