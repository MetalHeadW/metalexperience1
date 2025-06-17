package arrayList;
import javax.swing.JOptionPane;

public class Refractor3 {
	static String [] nomes;
    static double [] sal;
    static double [] salReajustado;
	
	public static void main(String[] args) {
		int n = lerInt("Quantidade de funcionários");
		nomes = new String[n];
		sal = new double[n];
		salReajustado = new double[n];
		cadastra();
		aplicaReajuste();
		relatorio();
	}
	static void relatorio() {
		String rel ="";
		for(int i=0; i < nomes.length; i++) {
		rel += nomes
		}
	}
	
	static void aplicaReajuste() {
		for(int i=0; i<sal.length; i++) {
			if(sal[i] <= 400) {
				salReajustado[i] = sal[i] * 1.25;
			}else if (sal[i] <= 600) {
				salReajustado[i] = sal[i] * 1.20;
		    }else if (sal[i] <= 800) {
				salReajustado[i] = sal[i] * 1.15;
		    }else {
				salReajustado[i] = sal[i] * 1.10;
		    }
		}
	}
	static void cadastra() {
		for(int i = 0; i<nomes.length; i++) {
			nomes[i] = lerStr("Nome " + (i+1));
			sal[i] = (double)lerInt("Salário atual de"+ nomes[i]);
		}
	}

	static String lerStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
}
