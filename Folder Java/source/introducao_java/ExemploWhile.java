package introducao_java;

import javax.swing.JOptionPane;

public class ExemploWhile {
	
	public static void main(String[] args) {
		String cardapio = "1 - Hambúrguer - 30,00\n"
				+ "2 - Pizza - 70,00\n"
				+ "3 - Camarão com fritas - 45,00\n"
				+ "4 - Frango a parmigiana - 50,00\n"
				+ "5 - Lazanha - 40,00\n\n"
				+ "6 - Sair";
		
		int op = 0;
		double total = 0;
		
		while(op != 6) {
			op = Integer.parseInt(JOptionPane.showInputDialog(cardapio));
			switch (op) {
			case 1: total += 30; JOptionPane.showMessageDialog(null, "Hambúrguer"); break;
			case 2: total += 70; JOptionPane.showMessageDialog(null, "Pizza"); break;
			case 3: total += 45; JOptionPane.showMessageDialog(null, "Camarão"); break;
			case 4: total += 50; JOptionPane.showMessageDialog(null, "Frango"); break;
			case 5: total += 40; JOptionPane.showMessageDialog(null, "Lazanha"); break;
			case 6: JOptionPane.showMessageDialog(null, "Adeus"); break;
			default:JOptionPane.showMessageDialog(null, "Inválido");break;
			}
		}
		JOptionPane.showMessageDialog(null, "Valor da conta: R$ "+total);
				
	}

}
