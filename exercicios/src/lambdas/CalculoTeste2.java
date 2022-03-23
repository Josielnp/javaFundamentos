package lambdas;

public class CalculoTeste2 {
	
	public static void main(String[] args) {
		
		Calculo calc = (x, y) -> {return x + y;	};
		
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x * y; // outra forma de escrever sem return retorna automatico a multiplicação
		
		System.out.println(calc.executar(2, 3));
		
	}

}
