package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	// Desafio Contrutor
	
	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial) {
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	// Fim Desafio contrutores
	
	// desafio metodo criando metodo na classe retornar data formatada
	
	String obterDataFormatada() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// funcao que não retorna nada, mas não ideal para usar em sistema. 
	
	void imprimirDataFormatada() {  //void = ausencia de retorno
		System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.println(obterDataFormatada()); // uma função pode chamar outra função / metodo
		
		
	}

}
