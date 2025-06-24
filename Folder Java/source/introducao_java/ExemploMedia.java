package introducao_java;

import javax.swing.JOptionPane;

public class ExemploMedia {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome:");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3:"));
		double media = (n1 + n2 + n3) / 3;
		if(media >= 7) {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ APROVADO(A)");
		}else if(media < 3) {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ REPROVADO(A)");
		}else {
			JOptionPane.showMessageDialog(null, nome + " ESTÁ EM RECUPERAÇÃO");
		}
	}

}
