package aval_pratica_3;

import javax.swing.JOptionPane;

public class Q1Sala {
	
	public static double calcMedia(int somaDosNumeros, int qtdNumeros) {
		return (double)somaDosNumeros / qtdNumeros;
	}
	
	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static void main(String[] args) {
		int n = lerInt("Quantos números?");
		int soma = 0;
		for(int i = 0; i< n; i++) {
			int nr = lerInt("Informe um número");
			soma += nr;
		}
		exibeMsg("Soma: "+ soma + "\nMédia:" + calcMedia(soma, n));
	}

}
