package arrayList;

import javax.swing.JOptionPane;

public class Refractor2 {
	static String[] marcas = new String[20];
	static String[] placas = new String[20];
	static int [] anos = new int[20];
	static int qtd = 0;
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastrar();
			if(op == 2) maisNovo();
			if(op == 3) buscaPorPlaca();
		}while(op !=4);
		
	}
	
	public static void maisNovo() {
		int anoMaior = anos[0];
	    String marcaMaior = marcas[0];
	    String placaMaior = placas[0];
	    for(int i = 1; i<qtd; i++) {
	    	if(anos[i] > anoMaior) {
	    		anoMaior = anos[i];
	    		marcaMaior = marcas[i];
	    		placaMaior = placas[i];
	    	}
	    }
	    exibeMsg("Carro mais novo:\n"+marcaMaior+"-"+placaMaior+"-"+anoMaior);
	   
	}
	
	static void buscaPorPlaca() {
		String placaBusca = lerStr("Qual placa deseja buscar?");
		int indice = -1;
		for (int i=0; i<qtd; i++) {
			if(placaBusca.equals(placas[i])) {
				indice = i;
			}
		}
		if(indice == -1) {
			exibeMsg("Não existe essa placa");
		}else {
			exibeMsg(marcas[indice] +  " - " + anos[indice] + " - " + placas[indice]);
		}
	}
	static void cadastrar() {
		if(qtd >= 20) {
			exibeMsg("Limite Excedido");
		}else {
			marcas[qtd] = lerStr("Marca:");
			placas[qtd] = lerStr("Placa:");
		    anos[qtd] = lerInt("Ano de Fabricação:");
		    qtd++;
		}
	}
	
	static int menu() {
		String m = "1 - Cadastrar\n"
				+"2 - Listar mais novo\n"
				+"3 - Buscar por Placa"
				+"4 - SAIR";
		return lerInt(m);
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
