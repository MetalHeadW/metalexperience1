package modularizacao.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {

	public static void main(String[] args) {
		String s1 = JOptionPane.showInputDialog("Senha");
		String s2 = JOptionPane.showInputDialog("Confirmação");
		if(iguais(s1, s2) && tamMin(s1) && temArroba(s1)) {
			exibeMsg("Válida");
		}else {
			exibeMsg("INVÁLIDA");
		}
	}
	
	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static boolean iguais(String s1, String s2) {
		return s1.equals(s2);
	}

	public static boolean tamMin(String s1) {
		return s1.length() >= 10;
	}
	
	public static boolean temArroba(String s1) {
		return s1.contains("@");
	}

}
