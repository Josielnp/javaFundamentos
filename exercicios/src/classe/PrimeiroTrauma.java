package classe;

public class PrimeiroTrauma {
	
	int a = 3;     // não pode mexer nessa linha
	static int b = 4;
	
	public static void main(String[] args) {
		
		PrimeiroTrauma p = new PrimeiroTrauma(); // 1 opção para acessar precisa criar uma instancio (objeto)
		System.out.println(p.a);
		
		
		System.out.println(b);   // 2 opção para acessar pode transforma em static.
		
		
	}

}
