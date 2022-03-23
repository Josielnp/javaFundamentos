package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		
		// para cada tipo primitivo int, byte e outros, existe um orinetado a objeto com letra maiuscula inicio Byte Integer.
		// Float, Double Boolean. entre outros onde é possivel trabalhar opções como ponto. .
		// ex. b.byteValue, s.toString, bo.toString, .toUpperCase.
		// Warappers opção de tipos primitivos tratado como objetos.
		
		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		System.out.println(c + "...");
	}

}
