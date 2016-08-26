package br.com.htcursos.ExerciciosLista11;

public class GerenciadorMatricula {

	private Matricula[] matricula;
	private Integer codigoSeq = 0;
	int pos = 0;

	public Integer gerarCodigoSequencialMatricula() {
		return codigoSeq++;

	}

	public Matricula[] buscarMatriculas(Curso curso) {
		Matricula[] resultMatricula = new Matricula[matricula.length];
		int cont = 0;

		for (int i = 0; i < matricula.length; i++) {

			if (matricula[i].getCurso().getNome().equals(curso.getNome())) {

				resultMatricula[cont++] = matricula[i];

			}
		}

		return resultMatricula;
	}

	public void cadastrar(Matricula mat) {

		Integer codigoMat = gerarCodigoSequencialMatricula();
		mat.setCodigo(codigoMat);

		if (pos < matricula.length) {
			matricula[pos++] = mat;

		}
	}

	// Getters E Setters
	public Matricula[] getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula[] matricula) {
		this.matricula = matricula;
	}

	public Integer getCodigoSeq() {
		return codigoSeq;
	}

	public void setCodigoSeq(Integer codigoSeq) {
		this.codigoSeq = codigoSeq;
	}

}
