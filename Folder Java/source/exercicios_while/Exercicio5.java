package exercicios_while;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		double temperatura = 0;
		double soma = 0;
		int qtd = 0;
		
		while(temperatura != -100) {
			temperatura = Double.parseDouble(JOptionPane.showInputDialog("Temperatura: (-100 para sair) "));
			if( temperatura != -100) {
				soma += temperatura;
				qtd ++;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Média:"+ (soma / qtd));
	}

}
