package arrayList;

import javax.swing.JOptionPane;

public class Refractor5 {
	
	static String[] nomes = new 
public static void main(String[] args) {
	
}

static int menu() {
	String m = "1 - Cadastrar\n"
			+"2 -Maior Preço\n"
			+"3 - Menor preço\n"
			+"4 - Maior estoque\n"
			+"5 - Menor estoque\n"
			+"6 - SAIR";
	return lerInt(m);
}

static String lerDouble(String msg) {
	return JOptionPane.showInputDialog(msg);
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

