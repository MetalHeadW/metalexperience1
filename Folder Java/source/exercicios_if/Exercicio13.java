package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio13 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		int dias = Integer.parseInt(JOptionPane.showInputDialog("Dias"));
		double valor = 100 * dias;
		double taxa = 0;
		if (dias > 15) {
			taxa = 5 * dias;
		} else {
			if (dias >= 10 && dias <= 14) {
				taxa = 6 * dias;
			} else {
				taxa = 8 * dias;
			}
		}

		JOptionPane.showMessageDialog(null, nome + "\nValor da hospedagem R$ " + (valor + taxa));

	}

}
