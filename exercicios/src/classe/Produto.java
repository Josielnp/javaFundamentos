package classe;

public class Produto {
	
	String nome;
	double preco;
	//double desconto;
	
	// desafio menbros de classe. aplicar 25% em todos os produtos
	
	static double desconto = 0.25;
	
	
	
	
	// Contrutores 
	
	Produto() {
		
	}
	
	Produto(String nomeInicial, double precoInicial) { //double descontoInicial 
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	
	// Fim contrutores	
	
	
	
	// metodo
	
	//tipo precoComDesconto (...) {} 
	//	return
	
	double precoComDesconto () { //(double p1, double d1) como dentro do objeto
		                        //ja tem os parametros não precisa passar
		return preco * (1 - desconto);
	}
	
	double precoComDesconto (double descontoGerente) { //(double p1, double d1) como dentro do objeto
        												//ja tem os parametros não precisa passar
		return preco * (1 - desconto + descontoGerente); // passando parametro desc.gerente.
}
	

}
