package oo.composicao.desafio;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adItem("Caneta", 1, 100);
		compra1.adItem(new Produto("Notebook", 2000), 2);
		
		Compra compra2 = new Compra();
		compra2.adItem("Caderno", 10, 10);
		compra2.adItem(new Produto("Impressora", 1000), 1);
		
		Cliente cliente = new Cliente("Maria Julia Moraes");
		//cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		cliente.adcompra(compra1);
	
		System.out.println(cliente.obterValorTotal());
		
	}

}
