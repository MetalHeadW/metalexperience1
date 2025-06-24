package exercicios_for;

import javax.swing.JOptionPane;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N:"));
		int result = 1;
		for(int i=1; i<=n; i++) {
			result *= i;
		}
		JOptionPane.showMessageDialog(null, result);
	}

}
