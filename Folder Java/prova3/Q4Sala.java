package aval_pratica_3;

import javax.swing.JOptionPane;

public class Q4Sala {

	public static int maior(int a, int b, int c) {
		if (a >= b && a >= c)
			return a;
		if (b >= a && b >= c)
			return b;
		if (c >= a && c >= b)
			return c;
		return 0;
	}

	public static int menor(int a, int b, int c) {
		if (a <= b && a <= c)
			return a;
		if (b <= a && b <= c)
			return b;
		if (c <= a && c <= b)
			return c;
		return 0;
	}

	public static String temIguais(int a, int b, int c) {
		if( a == b || a == c || b == c) 
			return "TEM números iguais";
		return "Não tem números iguais";
	}

	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

	public static void main(String[] args) {
		int n1 = lerInt("N1");
		int n2 = lerInt("N2");
		int n3 = lerInt("N3");
		exibeMsg("Maior: " + maior(n1, n2, n3));
		exibeMsg("Menor: " + menor(n1, n2, n3));
		exibeMsg(temIguais(n1, n2, n3));
	}

}
