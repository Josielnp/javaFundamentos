package controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String texto = "";

		do {				// USANDO O 'do / while ele sempre executa pelo menos uma vez
			System.out.println("Voc� precisa digitar "
					+ "\nas palavras m�gicas...");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
				
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!");
		entrada.close();
	}

}
