package br.com.htcursos.Aula02;

public class Pessoa {

	private String nome;
	private Cidade cidade;
	
	public Pessoa(){
			
	}
	
	public Pessoa(String nome, Cidade cidade){
		this.nome = nome;
		//setNome(nome);
		this.cidade=cidade;
		
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	
	
}
