package fundamentos.operadores;

public class Ternarios {
	
	public static void main(String[] args) {
		
		double media = 4.6;
		String resultadoFinal = media >= 7.00 ? "aprovado." : "em recupare��o.";
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		
		double nota = 6.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o.";
		
		System.out.printf( "Tem desconto? %s", resultado);
		
		
		
	}

}
