package introducao_java;

import javax.swing.JOptionPane;

public class TiposDeDados {
	
	public static void main(String[] args) {
//		String str = JOptionPane.showInputDialog("String:");
//		
//		System.out.println("Maiúsculo: " + str.toUpperCase());
//		System.out.println("Minúsculo: " + str.toLowerCase());
//		System.out.println("Tamanho: " + str.length());
//		System.out.println("1º caractere: " + str.charAt(0));
//		System.out.println("1º caractere (upper): " + str.toUpperCase().charAt(0));
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
		
		boolean estuda = true;
		
		char sexo = JOptionPane.showInputDialog("Sexo:")
				.toUpperCase().charAt(0);
		
		JOptionPane.showMessageDialog(null, "Idade: " + idade 
				+"\nSalário: R$" + salario+"\nEstuda: " + estuda 
				+ "\nSexo: "+ sexo);
		
	}

}
