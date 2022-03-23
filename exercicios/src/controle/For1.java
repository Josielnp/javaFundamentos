package controle;

public class For1 {
	
	public static void main(String[] args) {
		
//		int contador = 0;
//		while(contador <= 20) {
//			System.out.printf("i = %d\n", contador);
//			contador += 2;
//		}
		
// NO FOR ABAIXO FAZ EXATMENTE A MESMA COISA DO WHILE ACIMA.
		
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("i = %d\n", contador);
		}
		
		int x =2;        // apenas examplo usar a estrutura acima
		for(;x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// laço infinito
//		for(;;) {     // ou for(;true;)
//			System.out.println("Fim");
//		}
	}

}
