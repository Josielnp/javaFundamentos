package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	
	@SuppressWarnings({ "rawtypes", "unchecked" }) // silencia as advertencuias/ para elimitar os avisos do programa
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// CONVERSÃO AUTOMATICA DE TIPO PRIMITIVO
		
		conjunto.add(1.2); // não aceita primitivo vai converter de double para Double
		conjunto.add(true); // boolean para Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1); // int para Integer
		conjunto.add('x'); // char para Caracter
		
		System.out.println("Tamanho é " + conjunto.size());
		
		conjunto.add("teste");
		conjunto.add('x'); // continua sem add pois não aceita repetição
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("teste")); //remove e retorna valor true ou falso
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains('x')); // contains retorna f ou v se tem no conjunto
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); // faz a união entre conjunto e nums.
		
		conjunto.retainAll(nums); // intersecção entre dois conjunto
		System.out.println(conjunto);
		
		conjunto.clear(); // limpar conjunto
		System.out.println(conjunto);
				
		
		
		
	}

}
