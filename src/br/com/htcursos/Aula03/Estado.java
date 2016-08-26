package br.com.htcursos.Aula03;

public class Estado {
	private String nome;
	private String uf;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "nome= " + nome + ",uf=" + uf;
	}
	
	
//	public Cidade cidade;
//	
//	public void setCidadeGenerico(Object cidade){
//		
//		this.cidade = (Cidade) cidade;
//	
//	
//	}
	
}
