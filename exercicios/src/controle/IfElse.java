package controle;

import javax.swing.JOptionPane;

public class IfElse {
	
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o n�mero: ");
		int numero = Integer.parseInt(valor);
		
		// forma de usar condi��o com dois if
		if( numero % 2 == 0 ) {
			System.out.println("N�mero par!");
		}
		
		if(numero % 2 == 1) {
			System.out.println("N�mero �mpar!");
		}
		
		// forma para usar condi��o if/else
		if( numero % 2 == 0 ) {
			System.out.println("N�mero par!");
		}
		else { 
			System.out.println("N�mero �mpar!"); 
		}
		
	}
}
	