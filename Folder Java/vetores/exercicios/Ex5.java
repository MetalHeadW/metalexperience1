package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex5 {
	
	static String[] nomes = new String[50];
	static double[] precos = new double[50];
	static int[] estoques = new int[50];
	static int qtd = 0;
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastrar();
			if(op == 2) preco(true);
			if(op == 3) preco(false);
			if(op == 4) estoque(true);
			if(op == 5) estoque(false);
		}while(op!=6);
		
	}
	
	static void estoque(boolean maior) {
		int estoque = estoques[0];
		int indice = 0;
		for(int i=1; i<qtd; i++) {
			if(maior) {
				if(estoques[i] > estoque) {
					estoque = estoques[i];
					indice = i;
				}
			}else {
				if(estoques[i] < estoque) {
					estoque = estoques[i];
					indice = i;
				}
			}
		}
		exibeMsg(nomes[indice] 	+ " - " + estoques[indice] 	+ " - R$"+ precos[indice]);
	}
	
	static void preco(boolean maior) {
		double preco = precos[0];
		int indice = 0;
		for(int i=1; i<qtd; i++) {
			if(maior) {
				if(precos[i] > preco) {
					preco = precos[i];
					indice = i;
				}
			}else {
				if(precos[i] < preco) {
					preco = precos[i];
					indice = i;
				}
			}
		}
		exibeMsg(nomes[indice] 	+ " - " + estoques[indice] 	+ " - R$"+ precos[indice]);
	}
	
	static void cadastrar() {
		if(qtd >= 50) {
			exibeMsg("Limite excedido");
		}else {
			nomes[qtd] = lerStr("Nome:");
			precos[qtd] = lerDouble("Preço:");
			estoques[qtd] = lerInt("Estoque:");
			qtd++;
		}
	}
	
	static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Maior preço\n"
				+ "3 - Menor preço\n"
				+ "4 - Maior estoque\n"
				+ "5 - Menor estoque\n"
				+ "6 - SAIR";
		return lerInt(m);
	}
	
	static String lerStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	static double lerDouble(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

}
