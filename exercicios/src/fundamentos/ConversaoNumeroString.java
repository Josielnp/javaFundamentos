package fundamentos;

public class ConversaoNumeroString {
	
	public static void main(String[] args) {
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length()); // transformou num1 em string e contou quantos caracter
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length()); // Transformando num2 em string e contou caracter
		
		
		
		System.out.println(("" + num1).length()); // outra forma usando a conctana��o num com "" string
											     //resultado � uma string. assim pode usar as fun��es .length e outras
		System.out.println(("" + num2).length());
	}

}
