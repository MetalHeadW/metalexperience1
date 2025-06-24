package modularizacao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	public static void main(String[] args) {
		double min = lerDouble("Temperatura mínima");
		double max = lerDouble("Temperatura máxima");
		double atual = lerDouble("Temperatura atual");
		JOptionPane.showMessageDialog(null, verificaLimite(max, min, atual));
		JOptionPane.showMessageDialog(null, "Dif em relação a media: "
		+ diferenca(max, min, atual));
		alerta(max, atual);
	}
	
	public static double lerDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static String verificaLimite(double max, double min, double atual) {
		if( atual >= min && atual <= max) 
			return "Está na faixa permitida";
		return "FORA DO LIMITE";
	}
	
	public static double diferenca(double max, double min, double atual) {
		double media = (max + min) / 2;
		double diferenca = atual - media;
		if(diferenca < 0) {
			diferenca *= -1;
		}
		return diferenca;
	}
	
	public static void alerta(double max, double atual) {
		if( atual > max + 5) {
			JOptionPane.showMessageDialog(null, "CORRA VAI EXPLODIR");
		}
	}

}
