package objetos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CadastroTimes {
	
	static ArrayList<TimeFutebol> times = new ArrayList<TimeFutebol>();
	
public static void main(String[] args) {
	int op = 0;
	do {
		op = menu();
		if(op == 1) cadastraTime();
		if(op == 2) buscaTime();
		if(op == 3) exibeTimeMaisGols();
		}
	while(op != 4);
}
	
	
	static void exibeTimeMaisGols() {
		TimeFutebol mais = times.get(0);
		for(TimeFutebol t : times){
			if(t.gols > mais.gols) {
				mais = t;
			}
		}
		mostraDados(mais);
	}

static void buscaTime() {
	String nmBusca = JOptionPane.showInputDialog("Qual o nome?");
	for (TimeFutebol t : times) {
		if(t.nome.equalsIgnoreCase(nmBusca)) {
			mostraDados(t);
			return;
		}
	}
	JOptionPane.showMessageDialog(null, "time não cadastrado");
}

static int menu() {
	String m = "1 - Cadastrar\n"
			+"2 - Buscar por nome\n"
			+"3 - Times com mais gols\n"
			+"4 - Sair";
	return Integer.parseInt(JOptionPane.showInputDialog(m));
	
}
static void cadastraTime() {
	TimeFutebol t = new TimeFutebol();
	t.nome = JOptionPane.showInputDialog("Nome do Time: ");
	t.pais = JOptionPane.showInputDialog("País: ");
	t.gols = Integer.parseInt(JOptionPane.showInputDialog("Gols"));
	times.add(t);
}
static void mostraDados(TimeFutebol t) {
	String msg = "Nome do time" + t.nome+"\n"
			+"País: " + t.pais + "\n"
			+"Gols: " + t.gols + "\n";
	JOptionPane.showMessageDialog(null, msg);
}
}
