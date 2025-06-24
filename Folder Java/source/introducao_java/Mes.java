package introducao_java;

import javax.swing.JOptionPane;

public class Mes {
	
	public static void main(String[] args) {
		int mes = Integer.parseInt(JOptionPane.showInputDialog("1 a 12:"));
		String texto = "";
		switch (mes) {
			case 1: texto = "Janeiro"; break;
			case 2: texto = "Fevereiro"; break;
			case 3: texto = "Março"; break;
			case 4: texto = "Abril"; break;
			case 5: texto = "Maio"; break;
			case 6: texto = "Junho"; break;
			default: texto = "Inválido"; break;
		}
		JOptionPane.showMessageDialog(null, texto);
		
	}

}
