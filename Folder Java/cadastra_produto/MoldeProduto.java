package cadastra_produto;

public class MoldeProduto {
	String nome;
	int quantidade;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNome: " + nome + "\n" 
				+ "Cor: " + quantidade + "\n";
	}
}
