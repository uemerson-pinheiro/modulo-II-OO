package br.com.htcursos.Aula7;

public class ProgramaPrincipalException {

	public static void main(String[] args) {
		String cpf = "999.999.999-99";
		
		
		try {
			ValidacaoUtil.validarCpf(cpf);
		} catch (RuntimeException | CPFInvalidException e) {
			
			if(e instanceof CPFInvalidException)
				cpf = "11111111111";
										
		}
		
		try {
			ValidacaoUtil.validarCpf(cpf);
		} catch (Throwable e) {
			
			System.out.println("Segunda catch");
			
			e.printStackTrace();
		
		}
		
	}

}
