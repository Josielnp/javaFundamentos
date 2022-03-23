package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 10;
		d1.mes = 8;
		d1.ano = 1979;
		
		var d2 = new Data(31, 12, 2020);
		
		//var d2 = new Data();
		//d2.dia = 15;
		//d2.mes = 3;
		//d2.ano = 1978;
		
		System.out.printf("%d/%d/%d\n", d1.dia,d1.mes,d1.ano); // '\n' quebra linha para linha de baixo
		System.out.printf("%d/%d/%d\n", d2.dia,d2.mes,d2.ano);
		
		// chamando a data formatada
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}

}
