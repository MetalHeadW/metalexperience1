package exercicios_if;

import javax.swing.JOptionPane;

public class Exercicio11 {
	
	public static void main(String[] args) {
		
		String dias = "1 - Segunda a Sexta\n"
				+ "2 - Sábado ou domingo";
		int diaSemana = Integer.parseInt(JOptionPane.showInputDialog(dias));
		
		String horas = "1 - Das 08h às 18h\n"
				+ "2 - Das 18h às 08h";
		int hora = Integer.parseInt(JOptionPane.showInputDialog(horas));
		
		int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração da chamada"));
		
		double total = 0;
		
		if( diaSemana == 2) {
			total = 0.2 * duracao;
		}else {
			if(hora == 1) {
				total = 0.5 * duracao;
			}else {
				total = 0.3 * duracao;
			}
		}
		
		if(duracao > 60) {
			total = total * 0.95;
		}
		
		JOptionPane.showMessageDialog(null, "O valor da chamada foi de  R$:"+total);
		
	}

}
