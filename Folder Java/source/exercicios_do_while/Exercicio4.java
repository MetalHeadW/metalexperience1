package exercicios_do_while;

import javax.swing.JOptionPane;

public class Exercicio4 {
	
	public static void main(String[] args) {
		String menu = "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Multiplicação\n"
				+ "4 - Divisão\n"
				+ "5 - Sair";
		int op = 0;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			switch (op) {
			case 1:
				int soma = 0;
				int nr = 0;
				while(nr != -1) {
					nr = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
					soma += nr;
				}
				JOptionPane.showMessageDialog(null, "A soma é "+ soma);
				break;
			case 2:
				int n1 = Integer.parseInt(JOptionPane.showInputDialog("Nr 1"));
				int n2 = Integer.parseInt(JOptionPane.showInputDialog("Nr 2"));
				JOptionPane.showMessageDialog(null, "A subtração é "+ (n1 - n2));
				break;
			case 3:
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Nr 1"));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Nr 2"));
				JOptionPane.showMessageDialog(null, "A multiplicação é "+ (n1 * n2));
				break;
			case 4:
				n1 = Integer.parseInt(JOptionPane.showInputDialog("Nr 1"));
				n2 = Integer.parseInt(JOptionPane.showInputDialog("Nr 2"));
				JOptionPane.showMessageDialog(null, "A divisão é "+ (n1 / n2));
				break;
		
			}
			
		}while(op!=5);
	}

}
