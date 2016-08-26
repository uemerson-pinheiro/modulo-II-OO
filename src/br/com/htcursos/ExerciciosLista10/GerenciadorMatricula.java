package br.com.htcursos.ExerciciosLista10;

public class GerenciadorMatricula {

	private Matricula matricula[];
	private Integer codSequencial = 1;
	private Integer pos = 0;

	public void cadastrar(Matricula mat) {

		// Atribuir codigo gerado
		Integer codigoSequencial = gerarCodigoSequencial();
		mat.setCodigo(codigoSequencial);

		// Atribuir matricula
		if (pos < getQtdMatriculas())
			matricula[pos++] = mat;

	}
		// sobrecarga  de metodo
	public Matricula[] buscarMatriculas(Curso nomeCurso){
		Matricula resultadoMat[] = new Matricula[matricula.length];
		int cont = 0;
		for (int i = 0; i < matricula.length; i++) {

			// Comparando codigo do aluno da matricula com codigo do aluno da
			// busca
			if (matricula[i].getCurso().getNome().equals( nomeCurso.getNome()))
				resultadoMat[cont++] = matricula[i];

		}
		return null;
	}
	public Matricula[] buscarMatriculas(Aluno aluno) {
		Matricula resultadoMat[] = new Matricula[getQtdMatriculas()];
		int cont = 0;
		for (int i = 0; i < getQtdMatriculas(); i++) {

			// Comparando codigo do aluno da matricula com codigo do aluno da
			// busca
			if (matricula[i].getAluno().getCodigo() == aluno.getCodigo())
				resultadoMat[cont++] = matricula[i];

		}
		return resultadoMat;
	}

	public Integer gerarCodigoSequencial() {

		return codSequencial++;
	}

	public void imprimir() {

		for (int i = 0; i < matricula.length; i++)
			System.out.println(matricula[i].getAluno().getNome());

	}

	public void setQtdMatriculas(int qtd) {
		
		 matricula = new Matricula[qtd];
		
	}

	public int getQtdMatriculas() {
		
		return matricula.length;
	}
	
	
}
