package br.com.htcursos.ExerciciosLista13;

public class ContaCorrente extends Conta{

	static double jurosContaCorrente = 10;
	
	
	
	public ContaCorrente() {
		super();
		
	}

	public ContaCorrente(Double saldo, Correntista correntista){
		super();
		this.setSaldo(saldo);
		this.setCorrentista(correntista);
		
	}


	@Override
		
	public double atualizarSaldo(){
		
		return getSaldo()-(getSaldo()*1/100);
	}

}
