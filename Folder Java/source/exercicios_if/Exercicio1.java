package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio1 {
	
	public static void main(String[] args) {
		double preco = Double.parseDouble(JOptionPane.showInputDialog("Preco:"));
		if(preco > 10) {
			preco = preco * 0.9;
		}else {
			preco = preco * 0.95;
		}
		JOptionPane.showMessageDialog(null, "Preço com desconto: R$" + preco);
	}

}
