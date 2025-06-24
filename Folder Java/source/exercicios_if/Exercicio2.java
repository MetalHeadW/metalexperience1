package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salario:"));
		if( salario < 5000) {
			salario = salario * 1.3;
		}
		JOptionPane.showMessageDialog(null, "Salário: R$" + salario);
		
	}

}
