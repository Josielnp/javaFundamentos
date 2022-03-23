package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // conversão implicita // não tem problema double é maior que int.
		System.out.println(a); // saida vai ser 1.0 ja convertido.
		
		float bb = 1.0F; // Para tornar o literal um float acrescenta F.
		System.out.println(bb);
		
		float b = (float) 1.12345898989898; // conversão explicita (CAST). esta dizendo pro java o tipo.
											// pode haver perda de dados pois esta limitando
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversão explicita (CAST)
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e;        // conversão explicita (CAST)
		System.out.println(f);
		
	}

}
