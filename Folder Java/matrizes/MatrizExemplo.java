package matrizes;

import javax.swing.JOptionPane;

public class MatrizExemplo {
	
	static int[][] atendimentos = new int[7][3];
	public static void main(String[] args) {
		cadastra();
		listar();
	}
	static void listar() {
		for (int i=0; i<7; i++) {
			System.out.println();
			for(int j=0; j<3; j++) {
				System.out.print(atendimentos[i][j]);
				
			}
		}
	}
	static void cadastra() {
		for(int i=0; i<7; i++) {
			for(int j=0; j<3; j++) {
				atendimentos[i][j] =lerInt("Atendimentos" + i + " - " + j);
 			}
		}
	}
	
	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

}
