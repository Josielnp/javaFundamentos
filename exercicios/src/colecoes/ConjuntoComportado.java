package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		// CONJUNTO DE STRING
		
		//Set<String> listaAprovados = new HashSet<>(); // não respeita ordem de inserção
		SortedSet<String> listaAprovados = new TreeSet<>(); //nesse garante a ordem de inserção
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>(); // CONJUNTO DE INTEIROS
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		for(int n: nums) {
			System.out.println(n);
			
		}

	}
}
