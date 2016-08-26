package br.com.htcursos.ExerciciosLista13;

public abstract class Conta {

	private double saldo;
	private Correntista correntista;
	
	public Conta(){
		super();
	}
	public Conta(Double saldo, Correntista correntista){
		this.saldo =saldo;
		this.correntista = correntista;
	}
	
	public Correntista getCorrentista() {
		return correntista;
	}


	public void setCorrentista(Correntista correntista) {
		this.correntista = correntista;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public abstract double atualizarSaldo();


	@Override
	public String toString() {
		return "Conta saldo=" + saldo + ", correntista=" + correntista;
	}


	
	
}
