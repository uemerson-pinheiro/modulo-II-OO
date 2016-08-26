package br.com.htcursos.ExerciciosLista13;

public class ContaPoupanca extends Conta {

	static double percRendimentoContaPoupanca = 1;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(Double saldo, Correntista correntista) {
		super(saldo, correntista);

	}

	@Override
	public double atualizarSaldo() {
		return getSaldo()+(getSaldo()*10/100);
	}

}
