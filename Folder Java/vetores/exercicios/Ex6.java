package vetores.exercicios;

import javax.swing.JOptionPane;

public class Ex6 {
	
	static String[] nomes = new String[100];
	static String[] fones = new String[100];
	static int qtd = 0;
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if( op == 1) cadastrar();
			if( op == 2) buscar("nome");
			if( op == 3) buscar("telefone");
		}while(op != 4);
	}
	
	static void buscar(String tipoBusca) {
		String busca = lerStr("Qual " + tipoBusca + " deseja buscar?");
		String result = "";
		if(tipoBusca.equals("nome")) {
			for(int i=0; i< qtd; i++) {
				if(nomes[i].equalsIgnoreCase(busca)) {
					result += nomes[i] + " - " + fones[i] + "\n";
				}
			}
		}else {
			for(int i=0; i< qtd; i++) {
				if(fones[i].equalsIgnoreCase(busca)) {
					result += nomes[i] + " - " + fones[i] + "\n";
				}
			}
		}
		
		if( result.equals("")) 
			exibeMsg("Não encontrado");
		else 
			exibeMsg(result);
		
	}
	
	static void cadastrar() {
		if(qtd >= 100) {
			exibeMsg("Limite excedido");
		}else {
			nomes[qtd] = lerStr("Nome:");
			fones[qtd] = lerStr("Telefone:");
			qtd++;
		}
	}
	
	static int menu() {
		String m = "1 - Cadastrar\n"
				+ "2 - Buscar por nome\n"
				+ "3 - Buscar por telefone\n"
				+ "4 - SAIR";
		return lerInt(m);
	}
	
	static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	static String lerStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

}
