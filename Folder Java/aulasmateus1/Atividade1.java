package aulasmateus1;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class Atividade1 {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String nome = JOptionPane.showInputDialog("Nome");
	double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("altura"));
	
    
    double juros = calcularJurosSimples(capital, taxa, tempo);
    
    double montante = capital + juros;
    
    exibirResultado(juros, montante);
    
    scanner.close();
   
    
}
	public static double lerValor(Scanner scanner, String mensagem) {
		System.out.print(mensagem);
		return scanner.nextDouble();
	}
	
	public static double calcularJurosSimples(double capital, double taxa, double tempo) {
		return capital * taxa * tempo;
	}
	
	public static void exibirResultado(double juros, double montante) {
		System.out.printf("Juros Acumulados: R$ %.2f%n", juros);
		System.out.printf("Montante final: R$ %.2f%n", montante);
	}
}