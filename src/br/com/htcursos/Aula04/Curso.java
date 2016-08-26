package br.com.htcursos.Aula04;

public class Curso implements ItemPedido{

	//propriedade para os métodos definidos na interface
	private Integer codigo;
	private Double valor;
	private String descricao;
	
	//Propriedade especificas
	
	private String conteudo; 
	private String publicoAlvo; 
	private String cargaHoraria;

	
	public Curso(String descricao) {
		setDescricao(descricao);
	}
	public Curso() {
		// TODO Auto-generated constructor stub
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getPublicoAlvo() {
		return publicoAlvo;
	}
	public void setPublicoAlvo(String publicoAlvo) {
		this.publicoAlvo = publicoAlvo;
	}
	public String getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(String cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cargaHoraria == null) ? 0 : cargaHoraria.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((conteudo == null) ? 0 : conteudo.hashCode());
		result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
		result = prime * result + ((publicoAlvo == null) ? 0 : publicoAlvo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
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
		Curso other = (Curso) obj;
		if (cargaHoraria == null) {
			if (other.cargaHoraria != null)
				return false;
		} else if (!cargaHoraria.equals(other.cargaHoraria))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (conteudo == null) {
			if (other.conteudo != null)
				return false;
		} else if (!conteudo.equals(other.conteudo))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (publicoAlvo == null) {
			if (other.publicoAlvo != null)
				return false;
		} else if (!publicoAlvo.equals(other.publicoAlvo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		return true;
	}
	//
	public int compareTo(ItemPedido o) {
		
		if (this.valor == ((ItemPedido)o).getValor()) {
			return 0;
		}
		if (this.valor < ((ItemPedido)o).getValor()) {
			return -1;
		}
		return 1;
	}
	
	
	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", valor=" + valor + ", descricao=" + descricao + "]";
	}
	public String getNome() {
		
		return null;
	}
	
	
	
	
	
}
