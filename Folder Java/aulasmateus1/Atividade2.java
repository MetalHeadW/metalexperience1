package aulasmateus1;

import java.util.Scanner;



public class Atividade2 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite a primeira nota: ");
	double nota1 = scanner.nextDouble();
	System.out.print("Digite a segunda nota: ");
	double nota2 = scanner.nextDouble();
	System.out.print("Digite a terceira nota: ");
	double nota3 = scanner.nextDouble();
	    
	    double media =(nota1 + nota2 + nota3) /3;
	    
      System.out.printf("Média: %.2f%n", media);
      
      
	   if(media >=7) {
		   System.out.println("Aprovado");
	   }else if(media >=5 && media >= 6.9) {
		System.out.println("Em recuperação");  
	   }else {
		   System.out.println("Reprovado");
	   }
	    scanner.close();
	    }
}
 
