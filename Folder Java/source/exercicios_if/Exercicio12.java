package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio12 {
	
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		String condSaude = "Você tem alguma condição de saúde existente?\n"
				+ "Caso não tenha digite 'NÃO' e caso tenha digite quais";
		String saude = JOptionPane.showInputDialog(condSaude);
		double valor = 300.00;
		if(idade < 18) {
			valor = valor * 0.8;
		}else {
			if(idade > 40) {
				valor = valor * 1.2;
			}
		}
		
		if(!saude.equalsIgnoreCase("NÃO")) {
			valor = valor * 1.15;
		}
		
		JOptionPane.showMessageDialog(null, "Valor do plano R$ "+valor);
		
	}

}
