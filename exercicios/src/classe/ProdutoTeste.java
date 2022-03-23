package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
		//p1.nome ="Notebook";
		//p1.preco = 4356.89;
		//p1.desconto = 0.25;
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
				
		//double precoFinal1 = p1.preco * (1 - p1.desconto);
		double precoFinal1 = p1.precoComDesconto(); // trazendo a conta da classe produto		
		
		//double precoFinal2 = p2.preco * (1 - p2.desconto);
		double precoFinal2 = p2.precoComDesconto(0.1); // trazendo a conta da classe produto
		
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho = R$%.2f.", mediaCarrinho);
		
		
		
	}

}
