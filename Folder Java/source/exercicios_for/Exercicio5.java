package exercicios_for;

import javax.swing.JOptionPane;

public class Exercicio5 {
	
	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("N:"));
		
		int somaPares = 0;
		int somaImpares = 0;
		
		for( int i = 0; i< n; i++) {
			int nr = Integer.parseInt(JOptionPane.showInputDialog("Número "+ (i+1)));
			if( nr % 2 == 0) {
				somaPares += nr;
			}else {
				somaImpares += nr;
			}
		}
		
		JOptionPane.showMessageDialog(null, "Soma pares: "+somaPares+"\nSoma ímpares: "+ somaImpares);
		
	}

}
