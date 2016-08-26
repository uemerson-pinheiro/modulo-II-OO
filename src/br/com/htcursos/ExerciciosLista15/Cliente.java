package br.com.htcursos.ExerciciosLista15;



public class Cliente {
	
	private Integer id;
	private String nome;
	private String cpf;
	private String rg;
	private Cidade cidade;
	private Character sexo;
	
	
	public Cliente(){}
	public Cliente(String nome) {
		this.nome = nome;
	}
	public Cliente(int i){}
	
	public Cliente(String nome, Character sexo, Cidade cidade) {
	this.nome = nome;
//	this.cpf = cpf;
//	this.rg = rg;
	this.sexo = sexo;
	this.cidade = cidade;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	public Character getSexo() {
		return sexo;
	}
	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", cidade=" + getCidade().getNome() + ", sexo="
				+ sexo + "]";
	}
	

	
	
}
