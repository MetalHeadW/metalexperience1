package coisas;

import java.util.Scanner;

public class Vetores {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = lerInt("Quantas pessoas deseja cadastrar? ", scan);
		int[] idades = new int[n];
		String[] nomes = new String[n];
		int soma = 0;
		
		for(int i=0; i<n; i++) {
			nomes[i] = lerStr("Nome da " + (i+1) + "pessoa", scan);
			idades[i] = lerInt("Idade de " + nomes[i], scan);
			soma += idades[i];
		}
			exibeMsg("Media: " + calMedia(soma, idades.length),scan);
	scan.close();
	}
	

	public static double calMedia(int soma, int qtd) {
		
		return (double)soma/ qtd;
	}
	public static String lerStr(String msg,Scanner scan) {
	     System.out.println(msg);
		return scan.next();

}
	public static int lerInt(String msg, Scanner scan) {
		System.out.print(msg);
		return scan.nextInt();
	}
	
	public static void exibeMsg(String msg,Scanner scan) {
	     System.out.println(msg);

}
}