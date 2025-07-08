
package cadastra_produto;

public class MoldeProduto {
	String nome;
	int quantidade;
	double valor;
	
	public String toString() {
		return "\nNome: " + nome + "\n" 
				+ "Quantidade: " + quantidade + "\n"
		        + "R$" + valor + "\n";
		/// return nome + " - " + qtd + "\n";
	}
}