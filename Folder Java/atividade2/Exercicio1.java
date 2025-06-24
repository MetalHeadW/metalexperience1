package modularizacao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int op = 0;
		do {
			op = escolheMenu();
			switch (op) {
			case 1:
				exibeMsg("Resultado: " + 
						adicao(lerInt("Nr 1"), lerInt("Nr 2")));
				break;
			case 2:
				exibeMsg("Resultado da subtração: " 
						+ subtracao(lerInt("Numero 1"), lerInt("Numero 2")));
				break;
			case 3:
				exibeMsg("Resultado da multiplicação: " 
						+ multiplicacao(lerInt("Numero 1"), lerInt("Numero 2")));
				break;
			case 4:
				exibeMsg("Resultado da divisão: " 
						+ divisao(lerInt("Numero 1"), lerInt("Numero 2")));
				break;

			
			}
			
		}while(op != 5);

	}

	public static int escolheMenu() {
		String menu = " 1 - Adição\n" 
					+ "2 - Subtração\n" 
					+ "3 - Multiplicação\n" 
					+ "4 - Divisão\n" 
					+ "5 - Sair";
		return lerInt(menu);
	}

	public static int adicao(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int multiplicacao(int a, int b) {
		return a * b;
	}
	public static double divisao(int a, int b) {
		return (double)a / (double)b;
	}
	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	

}
