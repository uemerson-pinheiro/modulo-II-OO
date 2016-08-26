package br.com.htcursos.Aula03;

public class PessoaJuridica extends Pessoa{

	 private String razaoSocial;
	private String cnpj;
	
	
	
	public PessoaJuridica(String nome, Cidade cidade, String razaoSocial, String cnpj) {
		super(nome, cidade);
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
