package recursividade;

public class recursividade {
	public static void main(String[] args) {
		System.out.println(fatorial(BigInteger.valueOf(5)));
	}
	public static long fatorial (int n) {
		System.out.println(n);
		return n * fatorial(n-1);
		
		}
	}

