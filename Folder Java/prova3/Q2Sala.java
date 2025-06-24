package aval_pratica_3;

import javax.swing.JOptionPane;

public class Q2Sala {

	public static boolean validaNr(int numero) {
		return numero >= 0;
	}

	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static int fatorial(int nr) {
		int fat = 1;
		for (int i = 1; i <= nr; i++) {
			fat *= i;
		}
		return fat;
	}

	public static void main(String[] args) {
		int nr = lerInt("Número");
		if (validaNr(nr)) {
			exibeMsg("Fatorial: " + fatorial(nr));
		} else {
			exibeMsg("Número inválido");
		}
	}

}
