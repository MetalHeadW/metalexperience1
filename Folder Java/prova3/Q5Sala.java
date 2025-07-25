package aval_pratica_3;

import javax.swing.JOptionPane;

public class Q5Sala {
	
	public static void main(String[] args) {
		int nr = 0;
		int qtPos = 0;
		int qtNeg = 0;
		do {
			nr = menu();
			if( ePositivo(nr)) {
				qtPos++;
			}else {
				qtNeg ++;
			}
		}while( nr != 0);
		qtPos --;
		exibeMsg("Positivos: " + qtPos + "\nNegativos: " + qtNeg);
	}
	
	public static boolean ePositivo(int nr) {
		return nr >= 0;
	}
	
	public static int menu() {
		return lerInt("Digite um número diferente de zero\n 0 - SAIR");
	}
	
	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

}
