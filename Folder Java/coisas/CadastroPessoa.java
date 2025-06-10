package coisas;

import javax.swing.JOptionPane;

public class CadastroPessoa {

	static String nomes[] = new String[100];
	static int idades[] = new int[100];
	static int count = 0;

	public static void main(String[] args) {
       int op = 0;
       do {
    	   op = menu();
    	   switch (op) {
    	   case 1: cadastrar(); break;
    	   case 2: buscarPosicao(); break;
    	   case 3: listarTodos(); break;
    	   }
       }while(op != 4);
	}

	public static void listarTodos() {
		String msg = "***Pessoas Cadastradas***\n";
		for (int i = 0; i < count; i++) {
			msg += nomes[i] + "-" + idades[i] + "\n";
		}
		exibeMsg(msg);
	}

	public static void cadastrar() {
		if (count < 100) {
			nomes[count] = lerStr("digite a" + (count + 1) + "pessoa");
			idades[count] = lerInt("Idade de " + nomes[count]);
			count++;
		} else {
			exibeMsg("PAGUE O PREMIUM DO ESPOTEFAI");
		}
	}

	public static void buscarPosicao() {
		int pos = lerInt("Qual posição deseja buscar? ");
		if (pos <= count && pos > 0) {
			exibeMsg(nomes[pos - 1] + "-" + idades[pos - 1]);
		}else {
			exibeMsg("Posição inválida");
		}
	}

	public static int menu() {
		String m = "1 - Cadastrar\n" + "2 - Busca por opção\n" + "3 - Listar todos\n" + "4 - sair";
		return lerInt(m);
	}

	public static void exibeMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}

	public static String lerStr(String msg) {
		return JOptionPane.showInputDialog(msg);
	}

	public static int lerInt(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
}
