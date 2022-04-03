package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
public static void main(String[] args) {
		
		BinaryOperator<Double> calc = (x, y) -> {return x + y;	};
		System.out.println(calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y; // outra forma de escrever sem return retorna automatico a multiplica��o
		System.out.println(calc.apply(2.0, 3.0));
}	

}
