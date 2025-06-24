package introducao_java;

import javax.swing.JOptionPane;

public class ExemploFor2 {
	
	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Palavra:");
		String novaPalavra = "";
		for(int i=palavra.length()-1; i >=0; i--) {
			novaPalavra += palavra.charAt(i);
		}
		
		if(novaPalavra.equalsIgnoreCase(palavra)) {
			System.out.println("Palíndrome");
		}else {
			System.out.println("Não é");
		}
	}

}
