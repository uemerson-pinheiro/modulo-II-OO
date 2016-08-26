package br.com.htcursos.ExerciciosLista10;

import java.util.Date;

import br.com.htcursos.Aula04.Curso;

public class Matricula {

	private Integer codigo;
	private Date data;
	private Curso curso;
	private Aluno aluno;
	
	public Matricula(Aluno aluno, Curso curso, Date date) {
		setAluno(aluno);
		setCurso(curso);
		setData(date);
	}
	public Matricula() {
		
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	@Override
	public String toString() {
		return "Matricula codigo=" + codigo + ", data=" + data + ", curso=" + curso + ", aluno=" + aluno;
	}
	
	
}
