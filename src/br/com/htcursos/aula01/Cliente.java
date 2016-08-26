package br.com.htcursos.aula01;



public class Cliente {
	private String nome;
	private String sobrenome;
	private String sexo;
	private Double dataNascimento;
	private Cidade cidade;
	
	// GETTER E SETTER
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome.toLowerCase();
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo.toUpperCase();
	}
	public Double getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Double dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
}
