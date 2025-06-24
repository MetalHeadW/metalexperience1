package exercicios_switch;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário:"));
		char categoria = JOptionPane.showInputDialog("Categoria (de A a E)")
				.toUpperCase()
				.charAt(0);
		switch (categoria) {
		case 'A':
			salario = salario * 1.10;
			break;
		case 'B':
			salario = salario * 1.15;
			break;
		case 'C':
			salario = salario * 1.20;
			break;
		case 'D':
			salario = salario * 1.25;
			break;
		case 'E':
			salario = salario * 1.30;
			break;
		default:
			JOptionPane.showMessageDialog(null, "Categoria inválida");
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Salário novo:"+salario);
	}

}
