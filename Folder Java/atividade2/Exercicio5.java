package modularizacao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = escolheMenu();
			switch (op) {
			case 1:
				paraOutro(5.67, "Dólar");
				break;
			case 2:
				paraReal(5.67, "Dólar");
				break;
			case 3:
				paraOutro(6.46, "Euro");
				break;
			case 4:
				paraReal(6.46, "Euro");
				break;
			case 5:
				paraOutro(0.79, "Yuan");
				break;
			}
		}while(op != 6);
		
	}
	
	public static void paraReal(double cotacao, String nome) {
		double moeda = lerDouble("Valor em " + nome);
		JOptionPane.showMessageDialog(null, (moeda * cotacao) + " reais");
	}
	public static void paraOutro(double cotacao, String nome) {
		double reais = lerDouble("Reais:");
		JOptionPane.showMessageDialog(null, (reais / cotacao) + " em " + nome);
	}
	
	public static double lerDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static int escolheMenu() {
		String menu = "1 – Real para Dólar\n"
				+ "2 – Dólar para Real\n"
				+ "3 – Real para Euro\n"
				+ "4 – Euro para Real\n"
				+ "5 – Real para Yuan\n"
				+ "6 – Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(menu));
	}

}
