package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex4 {
	
	static double numeros[] = new double[20];
	
	public static void main(String[] args) {
		cadastra();
		substitui();
	}
	
	static void substitui() {
		double media = calMedia();
		for(int i=0; i<20; i++) {
			if( numeros[i] < media) {
				numeros[i] = media;
			}
		}
	}
	
	static double calMedia() {
		double soma = 0;
		for(int i=0; i<20; i++) {
			soma += numeros[i];
		}
		return soma / 20;
	}
	
	static void cadastra() {
		for(int i=0; i<20; i++) {
			numeros[i] = lerDouble("Digite o número " + (i+1));
		}
	}
	
	static double lerDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}

	static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

}
