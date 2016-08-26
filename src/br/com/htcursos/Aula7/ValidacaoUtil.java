package br.com.htcursos.Aula7;

public class ValidacaoUtil {

	public static void validarCpf(String cpf) throws CPFInvalidException{
		
		if(cpf.length()!=11){
			
			throw new CPFInvalidException();
		
		}
		else
			System.out.println(cpf);
		
	}
}
