package introducao_java;

import javax.swing.JOptionPane;

public class Teste {
	
	public static void main(String[] args) {
		String menu = "1 - Opção 1\n"
				+ "2 - Opção 2\n"
				+ "3 - Opção 3\n\n"
				+ "4 - SAIR";
		int op = 0;
		
		while(op!=4) {
			op = Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
	}

}
