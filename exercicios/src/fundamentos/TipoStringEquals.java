package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
				
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();    // next excluir espa�os em brancosna entrada, nextline considera os espa�os
		System.out.println("2" == s2.trim()); // .trim n�o considera os espa�os na entradad de dados
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
		
	}

}
