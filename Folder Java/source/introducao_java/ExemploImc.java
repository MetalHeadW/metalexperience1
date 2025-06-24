package introducao_java;

import javax.swing.JOptionPane;

public class ExemploImc {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome:");
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso:")); 
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:")); 
		
		double imc = peso / (altura * altura);
		
		JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nImc: " + imc);

	}

}
