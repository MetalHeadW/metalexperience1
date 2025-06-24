package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2:"));
		if( n1 > n2) {
			JOptionPane.showMessageDialog(null, "O maior número é "+n1);
		}else { 
			if(n2 > n1) {
				JOptionPane.showMessageDialog(null, "O maior número é "+n2);
			}else {
				JOptionPane.showMessageDialog(null, "Os números são iguais");
			}
		}
	}

}
