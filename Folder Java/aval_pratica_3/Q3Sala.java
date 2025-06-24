package aval_pratica_3;

import javax.swing.JOptionPane;

public class Q3Sala {

	public static void main(String[] args) {
		char op = ' ';
		int contA = 0;
		int contB = 0;
		int contC = 0;
		while (op != 'S') {
			op = menu();
			switch (op) {
			case 'A':
				contA++;
				break;
			case 'B':
				contB++;
				break;
			case 'C':
				contC++;
				break;
			}
		}

		int total = contA + contB + contC;
		String msg = "Romance: " + contA + " - " + calcPercentual(contA, total) + "%\n" 
		+ "Drama: " + contB + " - "	+ calcPercentual(contB, total) + "%\n" 
		+ "Terror: " + contC + " - " + calcPercentual(contC, total)	+ "%";
		exibeMsg(msg);

	}

	public static char menu() {
		String menu = "A – romance\n" + "B – Drama\n" + "C – Terror\n" + "S - SAIR";
		return lerChar(menu);
	}

	public static char lerChar(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase().charAt(0);
	}

	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static double calcPercentual(int qtd, int total) {
		return (double) qtd / total * 100;
	}

}
