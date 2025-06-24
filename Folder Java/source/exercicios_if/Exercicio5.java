package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:"));
		
		if( idade <=12) {
			JOptionPane.showMessageDialog(null, nome + " é criança");
		}else {
			if(idade <=20) {
				JOptionPane.showMessageDialog(null, nome + " é adolescente");
			}else {
				JOptionPane.showMessageDialog(null, nome + " é adulto(a)");
			}
		}
		
	}

}
