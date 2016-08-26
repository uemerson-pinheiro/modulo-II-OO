package br.com.htcursos.ExerciciosLista16;

import javax.swing.JOptionPane;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		try {
			
			Double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe numerador"));
			
			Double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe Denominador"));
			Calculadora.dividir(n1, n2);
			
		} catch (Exception e) {
			e.getMessage();
		}

		
	}

}
