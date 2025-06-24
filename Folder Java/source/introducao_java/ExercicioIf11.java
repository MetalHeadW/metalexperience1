package introducao_java;

import javax.swing.JOptionPane;

/*
 * Faça um algoritmo que leia salário e numero de dependentes 
 * de um funcionário. 
 * Sabendo que funcionários com mais de 2 dependentes 
 * recebem um abono de R$ 100.00 por dependente 
 * e os demais R$ 150.00 fixos, 
 * mostre ao final o valor a receber.
 */

public class ExercicioIf11 {

	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
		int dep = Integer.parseInt(JOptionPane.showInputDialog("Dependentes:"));

		double salFinal = 0;

		if (dep > 2) {
			salFinal = salario + (dep * 100.00);
		} else {
			if (dep >= 1) {
				salFinal = salario + 150.00;
			} else {
				salFinal = salario;
			}
		}
		JOptionPane.showMessageDialog(null, "Salário final R$" + salFinal);
	}

}
