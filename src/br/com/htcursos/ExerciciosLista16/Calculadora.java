package br.com.htcursos.ExerciciosLista16;

public class Calculadora {

	
	public static void dividir(double n1, double n2) throws CalculoException{
		
		if(n1==0 && n2==0){
			
			throw new CalculoException("Indefinido! O numerador e o denominador n�o devem ser iguais a zero.");
		}
		
		else if (n1!=0 && n2==0) {
			throw new CalculoException("O denominador n�o devem ser igual a zero.");
		}
		else {
			double result = n1/n2;
			System.out.println(result);
		} 
			
	}
}
