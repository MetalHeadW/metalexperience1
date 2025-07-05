package objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastraCarros {
	static ArrayList<MoldeCarro> carro = new ArrayList<MoldeCarro>(); 
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastraCarro();
			if(op == 2) mostraAno();
			if(op == 4) buscaMarca();
			if(op == 5) mostraCor();
			}
		while(op != 5);
	}
	static void buscaMarca() {
		String nmBusca = JOptionPane.showInputDialog("Qual a marca do carro?");
		for (MoldeCarro t : carro) {
			if(t.carro.equalsIgnoreCase(nmBusca)) {
				mostraDados(t);
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Carro não cadastrado");
	}
		
	
	static void mostraAno(){
		
	}
	static void mostraCor() {
		
	}
	static void mostraDados(MoldeCarro t) {
		String msg = "Nome do Carro" + t.carro+"\n"
				+"Ano: " + t.ano + "\n"
				+"Marca: " + t.marca + "\n"
		        +"Cor: " + t.cor + "\n";
		
		JOptionPane.showMessageDialog(null, msg);
	}
	
	static void cadastraCarro() {
		MoldeCarro t = new MoldeCarro();
		t.carro = JOptionPane.showInputDialog("Modelo do carro: ");
		t.ano = Integer.parseInt(JOptionPane.showInputDialog("Ano de fabricação inicial do modelo?"));
		t.marca = JOptionPane.showInputDialog("Marca do carro: ");
		t.cor = JOptionPane.showInputDialog("Cor que o carro está: ");
		carro.add(t);
	}

static int menu() {
	String m = "1 - Cadastrar\n"
			+"2 - Buscar por ano de fabricação\n"
			+"3 - Buscar por marca\n"
			+"4 - Buscar por cor\n"
			+"5 - Sair";
	return Integer.parseInt(JOptionPane.showInputDialog(m));
	
}

}
