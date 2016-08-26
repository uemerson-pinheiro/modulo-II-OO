package br.com.htcursos.Aula02;

public class ValidarUtil {

	static String cpfEstatico;
	
	public static boolean validarCpf(String cpf){
		
		if(cpf == null)
			return false;
		
		else
		cpfEstatico = cpf;
		return true;
	}
}
