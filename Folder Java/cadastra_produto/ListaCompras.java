package cadastra_produto;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class listaCompras {
	static ArrayList<MoldeProduto> lista = new ArrayList <MoldeProduto>();
	public static void main(String[] args) {
		int op = 0;
		do {
			op = escolheMenu();
		    if(op == 1) cadastra();
		    if(op == 2) listaNome();
		    if(op == 3) listarMais();
		}while(op != 4);
		
		
	}


public static void listarMais() {
	String ret = "Produtos que necessitam de mais de 10 unidades!\n";
	for(MoldeProduto e : lista) {
		if(e.quantidade > 10) {
			ret += e.toString() + "\n";
			}
}
	if(ret.equals("Produtos que necessitam de mais de 10 unidades!\n")) {
		JOptionPane.showMessageDialog(null, "Não encontrado");
	}else {
		JOptionPane.showMessageDialog(null, ret);
	}
}

static void listaNome() {
	String nomeBusca = JOptionPane.showInputDialog("Qual produto deseja buscar?");
	String ret = "Produto Localizado\n";
	for(MoldeProduto e : lista) {
		if(e.nome.equalsIgnoreCase(nomeBusca)) {
			ret += e.toString()  + "\n";
			}
}
	if(ret.equals("Produto Localizado\n")) {
		JOptionPane.showMessageDialog(null, "Não encontrado");
	}else {
		JOptionPane.showMessageDialog(null, ret);
	}
}


public static void cadastra() {
	MoldeProduto e = new MoldeProduto();
	e.nome = JOptionPane.showInputDialog("Nome do produto: ");
	e.quantidade = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade que desejas comprar??"));
	if(e.nome.trim().equals("") || e.quantidade < 0) {
		JOptionPane.showMessageDialog(null, "Faltam Informações");
	}else {
    lista.add(e);
}
}


static int escolheMenu() {
	String m = "1 - Cadastrar\n"
			+ "2 - Buscar pelo nome\n"
			+"3 - Listar os produtos mais necessitados\n"
			+"4 - Sair";
	return Integer.parseInt(JOptionPane.showInputDialog(m));
	
}


}



