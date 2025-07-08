package cadastra_produto;

public class MoldeProduto {
	String nome;
	int quantidade;
	
	public String toString() {
		return "\nNome: " + nome + "\n" 
				+ "Cor: " + quantidade + "\n";
		/// return nome + " - " + qtd + "\n";
	}
}