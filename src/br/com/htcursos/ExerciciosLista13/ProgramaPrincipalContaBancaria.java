package br.com.htcursos.ExerciciosLista13;

public class ProgramaPrincipalContaBancaria {

	public static void main(String[] args) {
		
	
		Conta contaPoupanca = new ContaPoupanca(5000.00, new Correntista(1,"Zé", "999.999.999-99"));
		
		contaPoupanca.atualizarSaldo();
		
		System.out.println(ContaPoupanca.percRendimentoContaPoupanca);
	
		System.out.println(contaPoupanca);
		
		System.out.println("########################");
		Conta contaCorrente = new ContaCorrente(6000.00, new Correntista(2, "Jão", "888.888.888-88"));
		
		contaCorrente.atualizarSaldo();
		
		System.out.println(ContaCorrente.jurosContaCorrente);
		
		System.out.println(contaCorrente);
	}

}
