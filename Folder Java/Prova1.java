
import javax.swing.JOptionPane;

public class Prova1 {
	public static double calcMedia(int somaNumeros, int qtdNumeros) {
		return (double) somaNumeros/ qtdNumeros;
	}


public static void exibeMsg(String msg) {
	JOptionPane.showMessageDialog(null, msg);
}

public static int lerInt(String msg) {
	return Integer.parseInt(JOptionPane.showInputDialog(msg));
}

public static void main(String[] args) {
	/* Scanner nome = new Scanner(System.in); */

	int n = lerInt("Quantos números");
	int soma = 0;
	for (int i = 0; i < n; i++) {
		int nr = lerInt(("Informe um Número"));
		soma += nr;

	}
	double media = (double) soma / n;
	exibeMsg("Soma: " + soma + "media" + media);
}
}
