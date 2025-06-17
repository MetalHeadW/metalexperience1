package arrayList;

import javax.swing.JOptionPane;

public class Refractor1 {
	
	static String[] cores = new String[5];
	
	public static void main(String[] args) {
		
	cadastra();
	exibeInverso();
	
		
	}
	public static void exibeInverso() {
		String res ="";
		for (int i=cores.length-1; i>=0; i--) {
			res += cores[i]+" ";
		}
		JOptionPane.showMessageDialog(null, res);
	}
	public static void cadastra() {
		for (int i=0; i<cores.length; i++) {
			cores[i] = lerCor();
		}
	}
  public static String lerCor() {
	  return JOptionPane.showInputDialog("Digite uma cor");
  }
}
