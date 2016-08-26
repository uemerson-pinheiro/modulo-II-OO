package br.com.htcursos.ExerciciosLista11;

import java.util.Date;
import java.util.Scanner;


public class ProjetoPrincipal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		Aluno aluno = new Aluno("Uemerson");
		Curso curso =new Curso("OO");
		
		GerenciadorMatricula gm = new GerenciadorMatricula();
		
		Matricula matricula = new Matricula();
		matricula.setAluno(aluno);
		matricula.setCurso(curso);
		matricula.setData(new Date());
		gm.cadastrar(matricula);
		
		
		Cidade cidade1 = new Cidade("Campo grande", new Estado("Mato grosso do sul","MS") );
		
		Cidade cidade2 = new Cidade("Dourados", new Estado("Mato grosso do sul", "MS"));
		
		Cidade cidade3 = new Cidade();
		cidade3 = cidade1;
		
		boolean igual = cidade1.equals(cidade2);
		boolean igual1 = cidade1.equals(cidade3);
		
		System.out.println("Cidade 1 e igual cidade 2?: "+igual );
		System.out.println("Cidade 1 e igual cidade 3?: "+igual1);
		System.out.println("Hascode cidade 1 "+cidade1.hashCode());
		System.out.println("Hascode cidade 2 "+cidade2.hashCode());
		
		
		

	}

}
