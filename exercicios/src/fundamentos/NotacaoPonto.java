package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		 
		String s  = "bom dia X";
		System.out.println(s);
		s = s.replace("X", "Senhora");
		System.out.println(s);
		s = s.toUpperCase();
		System.out.println(s);
		s = s.concat("!!!");
		System.out.println(s);
		
		String x = "leo".toUpperCase();
		System.out.println(x);
		
		String y = "bom dis".replace("X", "Gui").toUpperCase().concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
	}

}
