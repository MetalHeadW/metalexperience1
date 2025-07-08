package alunos;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class MainAluno {
	static ArrayList<MoldeAluno> lista = new ArrayList <MoldeAluno>();
	
	public static void main(String[] args) {
       int op = 0;
       do {
    	   op = escolheMenu();
    	   if(op == 1)cadastra();
    	   if(op == 2)listaMaior();
    	   if(op == 3)listarTodos();
       }while(op != 4);
		
	}
	
	static void listarTodos() {
		ordenar();
		String retorno = "";
		for (MoldeAluno a : lista) {
			retorno += a;
		}
		exibeRetorno(retorno);
	}
	

	static void exibeRetorno(String retorno) {
		if (retorno.equals("")) {
			JOptionPane.showMessageDialog(null, "Não encontrado", "Erro", 0);
		}else {
			JOptionPane.showMessageDialog(null, retorno);
		}
	}
	static void listaMaior() {
		int qtdMinima = Integer.parseInt(JOptionPane.showInputDialog(null, "Queres buscar acima de qual Altura?", "Pesquisa ai!", 1));
		String retorno = "";
		for (MoldeAluno a : lista) {
			if(a.altura >= qtdMinima) {
				retorno += a;
			}
		}
		exibeRetorno(retorno);
	}
	
	static void ordenar() {
		MoldeAluno aux = new MoldeAluno();
		for(int i = 0; i< lista.size(); i++) {
			for(int j = i+1; j < lista.size(); j++) {
				if (lista.get(j).altura < lista.get(i).altura) {
					aux = lista.get(j);
					lista.set(j, lista.get(i));
					lista.set(i, aux);
				}
			}
		}
	}

	public static void cadastra() {
		MoldeAluno a = new MoldeAluno();
		a.nome =  JOptionPane.showInputDialog(null, "Nome do Aluno: ", "Insira as informações!", 2);
		a.altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual a altura do aluno?", "Insira as informações!", 2));
		if(a.nome.trim().equals("") || a.altura < 0) {
			JOptionPane.showMessageDialog(null, "Faltam Informações", "Não encontrado", 0);
		}else {
	    lista.add(a);
	}
	}
	static int escolheMenu() {
		String m ="1 - Cadastrar\n"
				+"2 - Buscar por Altura\n"
				+"3 - Listar todos\n"
				+"4 - Sair";
		return Integer.parseInt(JOptionPane.showInputDialog(null, m,"Menu :) Selecione a Opção desejada!",3));
	}
}
