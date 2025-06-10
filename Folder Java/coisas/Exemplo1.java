package coisas;

import java.util.Scanner;

public class Exemplo1 {
public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	int n = lerInt("Quanas pessoas deseja cadastrar", scanner);
	int soma = 0;
	for (int i=0; i<n; i++) {
	 soma += lerInt("digite a idade da "+ (i+1) + "pessoa", scanner);
		
	}

    double media = calcMedia(soma, n);
    exibeMsg("A média das idades é: " + media, scanner);
	
	scanner.close();
}


public static double calcMedia(double soma, int qtd) {
	return soma/qtd;
 }
public static int  lerInt(String msg,Scanner scan) {
	 System.out.print(msg);
     return scan.nextInt();
}
public static void exibeMsg(String msg,Scanner scan) {
     System.out.println(msg);

}
}