package exemplo_bubble_sort;


public class Bubble_Sort {
	static int[] vetor = new int[] {10,1,12,50,18,68,45,78,15,3,5,6,8,7,9};
	
	
	public static void main(String[] args) {
	mostraVetor();
	ordenar();
	System.out.println("");
	mostraVetor();	
	}
	
	
	static void ordenar() {
		int aux = 0;
		for(int i = 0; i< vetor.length; i++) {
			for(int j = i+1; j< vetor.length; j++) {
				if(vetor[j] < vetor[i]) {
					aux = vetor[j];
					vetor[j] = vetor[i];
					vetor[i] = aux;
				}
				
			}
			
		}
	}
	
	static void mostraVetor() {
		for (int i : vetor) {
			System.out.print(i + " ");
		}
	}
}