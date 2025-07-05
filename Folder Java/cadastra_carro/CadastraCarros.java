package cadastra_carro;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastraCarros {
	static ArrayList<MoldeCarro> lista = new ArrayList<MoldeCarro>(); 
	public static void main(String[] args) {
		int op = 0;
		do {
			op = menu();
			if(op == 1) cadastraCarro();
			if(op == 2) buscaPeriodo();
			if(op == 3) buscaMarca();
			if(op == 4) buscaCor();
			}
		while(op != 5);
	}
	
	
	static void buscaMarca() {
	    int cont = 0;
		String marcaBusca = JOptionPane.showInputDialog("Marca:");
		String ret = "Carros Localizados\n";
		for(MoldeCarro t : lista) {
			if(t.marca.equalsIgnoreCase(marcaBusca)) {
				ret += t.toString()  + "\n";
				cont ++;
				}
	}
		if(ret.equals("Carros Localizados\n")) {
			JOptionPane.showMessageDialog(null, "Não encontrado");
		}else {
			double perc = (double)cont / lista.size() * 100;
			ret += "\n Percentual: " + perc + "%";

			JOptionPane.showMessageDialog(null, ret);
		}
	}
	
	static void buscaCor() {
		int cont = 0;
		String ret = "Carros Localizados\n";
		String corBusca = JOptionPane.showInputDialog("Marca:");
		for(MoldeCarro t : lista) {
			if(t.marca.equalsIgnoreCase(corBusca)) {
				cont ++;
				ret += t.toString() + "\n";
				}
	}
		if(ret.equals("Carros Localizados\n")) {
			JOptionPane.showMessageDialog(null, "Não encontrado");
		}else {
			double perc = (double)cont / lista.size() * 100;
			ret += "\n Percentual: " + perc + "%";
			JOptionPane.showMessageDialog(null, ret);
		}
	}
	
	static void buscaPeriodo(){
		int cont = 0;
		int anoIn = Integer.parseInt(JOptionPane.showInputDialog("Ano Inicial: "));
		int anoFin = Integer.parseInt(JOptionPane.showInputDialog("Ano final: "));
		String ret = "";
		for(MoldeCarro t : lista) {
			if(t.ano >= anoIn && t.ano <= anoFin) {
				cont ++;
				ret += t.toString() + "\n";
				}
	}
		if(ret.equals("Carros Localizados\n")) {
			JOptionPane.showMessageDialog(null, "Não encontrado");
		}else {
			double perc = (double)cont / lista.size() * 100;
			ret += "\n Percentual: " + perc + "%";
			JOptionPane.showMessageDialog(null, ret);
		}
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
		if(t.marca.equals("") || t.cor.trim().equals("") || t.ano < 1886) {
			JOptionPane.showMessageDialog(null, "Faltam Informações");
		}else {
	    lista.add(t);
	}
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
