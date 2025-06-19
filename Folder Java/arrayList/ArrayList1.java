package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList1 {
	
	static ArrayList <Integer> idades = new ArrayList<Integer>();
public static void main(String[] args) {
	int op = 0;
	do {
		op = menu();
		if (op == 1)cadastrar();
		if (op == 2)listar();
		
	}while(op != 3);
	
}

static void listar() {
	String result ="";
//	for(int i=0; i<idades.size(); i++) {
//		result += idades.get(i) + "\n";
//	}
	for(int idade: idades) {
		result += idade + "\n";
	}
	exibeMsg(result);
}
public static void cadastrar() {
	idades.add(lerInt("Idade:"));
}
public static void exibeMsg(String msg) {
	JOptionPane.showMessageDialog(null, msg);
}

public static int menu() {
	String m = "1 - cadastrar\n2 - listar\n3 - Sair";
	return lerInt(m);
}


public static int lerInt(String msg) {
	return Integer.parseInt(JOptionPane.showInputDialog(msg));
}
		
	}


