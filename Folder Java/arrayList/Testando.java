package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Testando {
	
	
	static ArrayList <String> nomes = new ArrayList<>();
	static ArrayList <String> fone = new ArrayList<>();
	
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if( op == 1) cadastrar();
			if( op == 2) buscar("nome");
			if( op == 3) buscar("telefone");
		}while(op != 4);
	}
	static void exibeDados(int indice) {
		if(indice == -1)
			exibeMsg("Não Encontrado");
		else
			exibeMsg(nomes.get(indice)+ " - " + fones.get(indice));
		
	}
	
	static void buscar(String tipoBusca) {
		String busca = lerStr("Qual " + tipoBusca + " deseja buscar?");
		int indice = -1;
		if(busca.equals("nome")) {
			exibeDados(nomes.indexOf(busca));
		}else {
			exibeDados(fone.indexOf(busca));
		}
///	String result = "";
///		if(tipoBusca.equals("nome")) {
///			for(int i=0; i< nomes.size(); i++) {
///				if(nomes.get(i).equalsIgnoreCase(busca)) {
///					result += nomes.get(i) + " - " + fone.get(i) + "\n";
///				}
///			}
///		}else {
///			for(int i=0; i< fone.size(); i++) {
///				if(fone.get(i).equalsIgnoreCase(busca)) {
///					result += nomes.get(i) + " - " + fone.get(i) + "\n";
///				}
///			}
///		}
///		
///		if( result.equals("")) 
///			exibeMsg("Não encontrado");
///		else 
///			exibeMsg(result);

    
		
	}
	
	static void cadastrar() {
	 fone.add(lerStr("Fone: "));
	 nomes.add(lerStr("Nome: "));

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


