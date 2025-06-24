package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do aluno(a)");
		double n1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double n2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double n3 = Double.parseDouble(JOptionPane.showInputDialog("Nota 3"));
		double media = (n1 + n2 + n3) / 3;
		if( media >= 7) {
			JOptionPane.showMessageDialog(null, nome + " está APROVADO(a)");
		}else {
			if(media >= 4.5) {
				JOptionPane.showMessageDialog(null, nome + " está em RECUPERAÇÃO");
			}else {
				JOptionPane.showMessageDialog(null, nome + " está REPROVADO(a)");
			}
		}
	}

}
