import javax.swing.JOptionPane;

public class Prova4 {
	 public static int maior(int a, int b, int c) {
		 if (a >= b && a >= c) return a;
		 if (b >= a && b >= c) return b;
		 if (c >= a && c >= b) return c;
		 return 0;
		 
	 }
	 public static int menor(int a, int b, int c) {
		 if (a <= b && a <= c) return a;
		 if (b <= a && b <= c) return b;
		 if (c <= a && c <= b) return c;
		 return 0;
		 
	 }
	 
	 public static String temIguais(int a, int b, int c) {
		 if(a!=b && a!=c && b!=c) 
		 return "não tem numeros iguais";
	return "tem numeros iguais";
		 
	 }
	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}

	public static void main(String[] args) {
		int a = lerInt("A");
		int b = lerInt("B");
		int c = lerInt("C");
		
		exibeMsg("Maior: " + maior(a,b,c));
		exibeMsg("Menor: " + menor(a,b,c));
		exibeMsg(temIguais(a,b,c));
	}

}
