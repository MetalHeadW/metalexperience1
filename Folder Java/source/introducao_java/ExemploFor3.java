package introducao_java;

import javax.swing.JOptionPane;

public class ExemploFor3 {
	
	public static void main(String[] args) {
//		for(int i=0; i<10; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.println("i = " + i +", j= "+j);
//			}
//		}
		
		for(int i=0; i<10; i++) {
			String nome = JOptionPane.showInputDialog("Nome:");
			double soma = 0;
			double media = 0;
			for(int j=1; j<=3; j++) {
				double n = Double.parseDouble(JOptionPane.showInputDialog("N"+j));
				soma += n;
				media = soma / 3;
			}
			JOptionPane.showMessageDialog(null, nome + " média: " + media);
		}
	}

}
