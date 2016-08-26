package br.com.htcursos.Aula04;

public interface ItemPedido extends Comparable<ItemPedido>{

	//utilizado para garantir uma ordenação
	
	public Integer getCodigo() ;
	public void setCodigo(Integer codigo);
	public Double getValor() ;
	public void setValor(Double valor);
	public String getDescricao() ;
	public void setDescricao(String descricao);
}
