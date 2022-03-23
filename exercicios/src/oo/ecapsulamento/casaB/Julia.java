package oo.ecapsulamento.casaB;

import oo.ecapsulamento.casaA.Ana;

public class Julia {
	
	void testeAcessos() {
		
		Ana sogra = new Ana();
		
		// segredo
		// facoDentroDeCasa
		// formaDeFalar
		// todosSabem
		
	
		//System.out.println(sogra.segredo); //atributo priviado não tem acesso
		//System.out.println(sogra.fadoDentroDeCasa);
		//System.out.println(sogra.formaDeFalar); // ACESSA DIRETO O ATRIBUTO.
		System.out.println(sogra.todosSabem);
	}
}



