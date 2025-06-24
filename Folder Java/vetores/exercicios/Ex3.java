package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex3 {

	static String[] nomes;
	static double[] sal;
	static double[] salReajustado;
	static int[] filhos;

	public static void main(String[] args) {
		int n = lerInt("Quantidade de funcionários");
		nomes = new String[n];
		sal = new double[n];
		salReajustado = new double[n];
		filhos = new int[n];
		cadastra();
		aplicaReajuste();
		relatorio();
	}
	
	static void relatorio() {
		String rel = "";
		for (int i = 0; i < nomes.length; i++) {
			rel += nomes[i] + " - Anterior R$" + sal[i] 
					+"Filhos " + filhos[i]
					+ " reajustado R$" 
					+ salReajustado[i] + "\n";
		}
		exibeMsg(rel);
	}

	static void aplicaReajuste() {
		for (int i = 0; i < sal.length; i++) {
			if (filhos[i] <= 1) {
				salReajustado[i] = sal[i] + 100;
			} else if (filhos[i] <= 2) {
				salReajustado[i] = sal[i] + 200;
			} else if (filhos[i] <= 3) {
				salReajustado[i] = sal[i] + 300;
			} else {
				salReajustado[i] = sal[i] + 400;
			}
		}
	}

	static void cadastra() {
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = lerStr("Nome " + (i + 1));
			sal[i] = lerDouble("Salário atual de " + nomes[i]);
			filhos[i]= lerInt("Quantos filhos?");
		}
	}

	static String lerStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

	static double lerDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}

	static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

}
